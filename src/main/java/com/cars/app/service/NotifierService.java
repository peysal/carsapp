package com.cars.app.service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface NotifierService {

    /**
     * Send email
     *  @param recipient   email receiver
     * @param messageContent     email content
     * @param attachments
     */
    void notify(final String recipient, final Map<String, Object> messageContent,
                final List<AttachmentCreatorService> attachments) throws IOException, MessagingException;
}
