package com.cars.app.service;

import java.util.Map;

/**
 * @author 409082
 */
public interface ViewModel {

    /**
     * Map all the view model fields data into map format
     * @return map of view model
     */
    Map<String, String> mapAll();
}
