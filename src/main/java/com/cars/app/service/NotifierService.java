package com.cars.app.service;

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
                final List<AttachmentCreatorService> attachments);
}
