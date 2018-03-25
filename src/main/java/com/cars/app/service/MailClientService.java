package com.cars.app.service;

import java.util.List;

public interface MailClientService {

    /**
     * Send email
     *
     * @param recipient   email receiver
     * @param message     email content
     * @param attachments
     */
    void send(final String recipient, final String message, final List<AttachmentCreatorService> attachments);
}
