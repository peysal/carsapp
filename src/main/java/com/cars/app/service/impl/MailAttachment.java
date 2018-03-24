package com.cars.app.service.impl;

import com.cars.app.service.AttachmentCreatorService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class MailAttachment implements AttachmentCreatorService {

    private final Logger log = LoggerFactory.getLogger(MailAttachment.class);

    @Override
    public ByteArrayResource create(final String data) throws IOException {
        try (InputStream is = new ByteArrayInputStream(data.getBytes())) {
            return new ByteArrayResource(IOUtils.toByteArray(is));
        }
    }
}
