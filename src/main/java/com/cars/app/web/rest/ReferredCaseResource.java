package com.cars.app.web.rest;

import com.cars.app.service.AttachmentCreatorService;
import com.cars.app.service.impl.MailAttachment;
import com.cars.app.service.impl.ObjectToCsv;
import com.cars.app.service.impl.ReferredCaseMail;
import com.cars.app.web.rest.vm.ReferredCaseVM;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ReferredCase controller
 */
@RestController
@RequestMapping("/api/referred-case")
@Timed
public class ReferredCaseResource {

    private final Logger log = LoggerFactory.getLogger(ReferredCaseResource.class);
    private ObjectToCsv objectToCsv;
    private ReferredCaseMail referredCaseMail;

    public ReferredCaseResource(ObjectToCsv objectToCsv, ReferredCaseMail referredCaseMail) {
        this.objectToCsv = objectToCsv;
        this.referredCaseMail = referredCaseMail;
    }

    /**
     * POST notifyByEMail
     */
    @PostMapping("/notify-by-e-mail")
    public ResponseEntity notifyByEMail(@RequestBody ReferredCaseVM referredCaseVM) {
        AttachmentCreatorService noVarient = new MailAttachment();
        noVarient.setup("No Varient", "CSV", this.objectToCsv.convert(referredCaseVM));
        AttachmentCreatorService referCase = new MailAttachment();
        referCase.setup("Refer Case", "CSV", this.objectToCsv.convert(referredCaseVM));
        List<AttachmentCreatorService> attachments = new ArrayList<>();
        attachments.add(noVarient);
        attachments.add(referCase);
        try {
            this.referredCaseMail.notify(referredCaseVM.getEmail(), referredCaseVM.mapAll(), attachments);
            return new ResponseEntity<>("email was sent", HttpStatus.OK);
        } catch (Exception ex) {
            log.warn("email not sent", ex);
            return new ResponseEntity<>("email not sent", HttpStatus.BAD_REQUEST);
        }
    }

}
