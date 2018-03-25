package com.cars.app.service.impl;

import com.cars.app.service.AttachmentCreatorService;
import com.cars.app.service.MailClientService;
import org.apache.commons.lang3.CharEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailNotifier implements MailClientService {

    private final Logger log = LoggerFactory.getLogger(MailNotifier.class);
    private JavaMailSender mailSender;

    @Override
    public void send(final String recipient, final String message,
                     final List<AttachmentCreatorService> attachments) {
        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, CharEncoding.UTF_8);
            messageHelper.setFrom("babunPelangi@bhr.com");
            messageHelper.setTo(recipient);
            messageHelper.setSubject("Dont work over the weekend");
            messageHelper.setText(message);
            for (AttachmentCreatorService attachment : attachments) {
                messageHelper.addAttachment(attachment.getFileName(), attachment.create(),
                    attachment.getContentType());
            }
        };
        mailSender.send(messagePreparator);
    }

    @Autowired
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
}
