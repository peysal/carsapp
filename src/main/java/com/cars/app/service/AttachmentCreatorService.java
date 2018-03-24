package com.cars.app.service;

import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;

public interface AttachmentCreatorService {

    /**
     * Create an attachment
     *
     * @param data in readable format
     * @return byteArrayResource
     */
    ByteArrayResource create(final String data) throws IOException;

}
