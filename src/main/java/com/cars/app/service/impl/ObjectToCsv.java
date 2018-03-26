package com.cars.app.service.impl;

import com.cars.app.service.ObjectConverterService;
import com.cars.app.service.ViewModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;

@Service
public class ObjectToCsv implements ObjectConverterService {

    private final Logger log = LoggerFactory.getLogger(ObjectToCsv.class);

    @Override
    public String convert(final ViewModel vm) {
        Map<String, Object> mappedViewModel = vm.mapAll();
        StringBuilder csvHeader = new StringBuilder();
        StringBuilder csvLine = new StringBuilder();
        for (Iterator<Map.Entry<String, Object>> iterator = mappedViewModel.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Object> entry = iterator.next();
            csvHeader.append(entry.getKey());
            csvLine.append(entry.getValue());
            if(iterator.hasNext()){
                csvHeader.append("\t");
                csvLine.append("\t");
            }
        }
        String csvOuput = csvHeader.append("\n").append(csvLine).append("\n").toString();
        return csvOuput;
    }
}
