package com.cars.app.service;

import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;

public interface AttachmentCreatorService {

    /**
     * Create an attachment
     * @return byteArrayResource
     */
    ByteArrayResource create() throws IOException;

    /**
     * File name
     *
     * @return file name
     */
    String getFileName();

    /**
     * Attachment content type
     *
     * @return CSV, pdf, txt
     */
    String getContentType();
}
