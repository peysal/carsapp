package com.cars.app.service.impl;

import com.cars.app.service.AttachmentCreatorService;
import com.cars.app.service.NotifierService;
import io.github.jhipster.config.JHipsterProperties;
import org.apache.commons.lang3.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;

import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Service
public class ReferredCaseMail implements NotifierService {

    private static final String CONTENT = "referred";
    private static final String BASE_URL = "baseUrl";
    private final Logger log = LoggerFactory.getLogger(ReferredCaseMail.class);
    private JHipsterProperties jHipsterProperties;
    private SpringTemplateEngine templateEngine;
    private MessageSource messageSource;
    private JavaMailSender javaMailSender;

    @Override
    public void notify(final String recipient, final Map<String, Object> messageContent,
                       final List<AttachmentCreatorService> attachments) {
        setupTemplate(recipient, messageContent, "referredCaseEmail", "email.referredCase.title",
            attachments);
    }

    @Async
    public void setupTemplate(final String recipient, final Map<String, Object> messageContent,
                              final String templateName, final String titleKey,
                              final List<AttachmentCreatorService> attachments) {
        Locale locale = Locale.US;
        Context context = new Context(locale);
        context.setVariable(CONTENT, messageContent);
        context.setVariable(BASE_URL, jHipsterProperties.getMail().getBaseUrl());
        String content = templateEngine.process(templateName, context);
        String subject = messageSource.getMessage(titleKey, null, locale);
        sendEmail(recipient, subject, content, false, true, attachments);

    }

    @Async
    public void sendEmail(String to, String subject, String content, boolean isMultipart, boolean isHtml,
                          List<AttachmentCreatorService> attachments) {
        log.debug("Send email[multipart '{}' and html '{}'] to '{}' with subject '{}' and content={}",
            isMultipart, isHtml, to, subject, content);

        // Prepare message using a Spring helper
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, isMultipart, CharEncoding.UTF_8);
            message.setTo(to);
            message.setFrom(jHipsterProperties.getMail().getFrom());
            message.setSubject(subject);
            for (AttachmentCreatorService attachment : attachments) {
                message.addAttachment(attachment.getFileName(), attachment.create(), attachment.getContentType());
            }
            message.setText(content, isHtml);
            javaMailSender.send(mimeMessage);
            log.debug("Sent email to User '{}'", to);
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.warn("Email could not be sent to user '{}'", to, e);
            } else {
                log.warn("Email could not be sent to user '{}': {}", to, e.getMessage());
            }
        }
    }
}
