package com.cars.app.service.impl;

import com.cars.app.service.ObjectConverterService;
import com.cars.app.service.ViewModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ObjectToCsvTest {

    private ObjectConverterService uut;

    @Before
    public void setUp() throws Exception {
        this.uut = new ObjectToCsv();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convert() {
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
        sb.append("developer");
        sb.append("\t");
        sb.append("Sedan");
        sb.append("\t");
        sb.append("1234");
        sb.append("\t");
        sb.append("123");
        sb.append("\t");
        sb.append("1222");
        sb.append("\t");
        sb.append("No variant series is found in Diamond/ISM");
        sb.append("\t");
        sb.append("Ayam");
        sb.append("\n");

        ViewModel vmStub = new ReferredCaseVM();
        String result = this.uut.convert(vmStub);
        assertNotNull("cannot be null laa kawan", result);
        assertEquals("should be equal", sb.toString(), result);
    }

    /**
     * Stub
     */
    private class ReferredCaseVM implements ViewModel {

        @Override
        public Map<String, String> mapAll() {
            Map<String, String> requestMap = new LinkedHashMap<>();
            requestMap.put("Road Tax Renewal (either Yes or No)", "Yes");
            requestMap.put("Occupation", "developer");
            requestMap.put("Vehicle Body Type", "Sedan");
            requestMap.put("Basic Premium", "1234");
            requestMap.put("Gross Premium", "123");
            requestMap.put("Total Payable Amount", "1222");
            requestMap.put("Description", "No variant series is found in Diamond/ISM");
            requestMap.put("Agent Tagged", "Ayam");
            return requestMap;
        }
    }
}
