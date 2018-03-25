package com.cars.app.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ByteArrayResource;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MailAttachmentTest {

    private final String multilineRegex = "\\A";
    private MailAttachment uut;
    private String expected;

    @Before
    public void setUp() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("Road Tax Renewal (either Yes or No)");
        sb.append("\t");
        sb.append("Occupation");
        sb.append("\t");
        sb.append("Vehicle Body Type");
        sb.append("\t");
        sb.append("Basic Premium");
        sb.append("\t");
        sb.append("Gross Premium");
        sb.append("\t");
        sb.append("Total Payable Amount");
        sb.append("\t");
        sb.append("Description");
        sb.append("\t");
        sb.append("Agent Tagged");
        sb.append("\n");
        sb.append("Yes");
        sb.append("\t");
        sb.append("Engineer");
        sb.append("\t");
        sb.append("Sedan");
        sb.append("\t");
        sb.append("1545");
        sb.append("\t");
        sb.append("1300");
        sb.append("\t");
        sb.append("1500");
        sb.append("\t");
        sb.append("No variant series is found in Diamond/ISM");
        sb.append("\t");
        sb.append("Agen Ali");
        sb.append("\n");
        this.uut = new MailAttachment();
        this.uut.setup("1st file", "CSV", sb.toString());
        expected = sb.toString();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() throws IOException {
        String resultString = null;

        ByteArrayResource result = this.uut.create();
        try (Scanner scanner = new Scanner(result.getInputStream(), StandardCharsets.UTF_8.name())) {
            resultString = scanner.useDelimiter(multilineRegex).next();
        }

        assertEquals(expected, resultString);
    }
}
