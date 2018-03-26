package com.cars.app.web.rest;

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

/**
 * ReferredCase controller
 */
@RestController
@RequestMapping("/api/referred-case")
@Timed
public class ReferredCaseResource {

    private final Logger log = LoggerFactory.getLogger(ReferredCaseResource.class);

    /**
     * POST notifyByEMail
     */
    @PostMapping("/notify-by-e-mail")
    public ResponseEntity notifyByEMail(@RequestBody ReferredCaseVM referredCaseVM) {
        return new ResponseEntity<>("email was sent", HttpStatus.OK);
    }

}
