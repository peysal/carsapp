package com.cars.app.service;

import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;

public interface AttachmentCreatorService {

    /**
     * Setup all the service attribute
     *
     * @param fileName
     * @param contentType
     * @param formattedData
     */
    void setup(final String fileName, final String contentType, final String formattedData);

    /**
     * Create an attachment
     * @return byteArrayResource
     */
    ByteArrayResource create() throws IOException;

    /**
     * Get attachment name
     * @return attachment full name
     */
    String getAttachmentName();
}
