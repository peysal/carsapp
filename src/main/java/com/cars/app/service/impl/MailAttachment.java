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
    private String fileName;
    private String contentType;
    private String formattedData;

    MailAttachment(final String fileName, final String contentType, final String formattedData) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.formattedData = formattedData;
        log.info("filename:" + this.fileName + " content type:" + this.contentType);
    }

    @Override
    public ByteArrayResource create() throws IOException {
        log.debug("formatted data:" + this.formattedData);
        try (InputStream is = new ByteArrayInputStream(this.formattedData.getBytes())) {
            return new ByteArrayResource(IOUtils.toByteArray(is));
        }
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }

    @Override
    public String getContentType() {
        return this.formattedData;
    }
}
