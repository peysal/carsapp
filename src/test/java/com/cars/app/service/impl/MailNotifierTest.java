package com.cars.app.service.impl;

import com.cars.app.service.AttachmentCreatorService;
import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MailNotifierTest {

    private GreenMail smtpServer;
    private MailNotifier mailClient;

    @Before
    public void setUp() throws Exception {
        smtpServer = new GreenMail(new ServerSetup(1025, null, "smtp"));
        smtpServer.start();
        mailClient = new MailNotifier();
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setPort(1025);
        mailClient.setMailSender(javaMailSender);
    }

    @After
    public void tearDown() throws Exception {
        smtpServer.stop();
    }

    private void assertReceivedMessageContains(String expected) throws IOException, MessagingException {
        MimeMessage[] receivedMessages = smtpServer.getReceivedMessages();
        assertEquals(1, receivedMessages.length);
        String content = (String) receivedMessages[0].getContent();
        assertTrue(content.contains(expected));
    }

    @Test
    public void send() throws IOException, MessagingException {
        //given
        String message = "yooo apa";
        AttachmentCreatorService mockAttachment = new MailAttachment("HelloWorld", "CSV",
            "HelloBabun");
        List<AttachmentCreatorService> attachments = new ArrayList<>();
        attachments.add(mockAttachment);
        //when
        mailClient.send("hello@babun.com", "yooo apa", attachments);
        //then
        assertReceivedMessageContains(message);
    }
}
