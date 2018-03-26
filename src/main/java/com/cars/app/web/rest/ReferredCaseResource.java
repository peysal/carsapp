package com.cars.app.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ReferredCase controller
 */
@RestController
@RequestMapping("/api/referred-case")
public class ReferredCaseResource {

    private final Logger log = LoggerFactory.getLogger(ReferredCaseResource.class);

    /**
     * POST notifyByEMail
     */
    @PostMapping("/notify-by-e-mail")
    public String notifyByEMail() {
        return "notifyByEMail";
    }

}
