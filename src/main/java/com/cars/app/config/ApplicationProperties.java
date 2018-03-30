package com.cars.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to JHipster.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final ReferredEmail referredEmail = new ReferredEmail();

    public ReferredEmail getReferredEmail() {
        return this.referredEmail;
    }

    public static class ReferredEmail {

        private String fixedRecipient;

        public String getFixedRecipient() {
            return fixedRecipient;
        }

        public void setFixedRecipient(String fixedRecipient) {
            this.fixedRecipient = fixedRecipient;
        }
    }
}
