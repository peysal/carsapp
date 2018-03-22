package com.cars.app.service;

/**
 * @author 409082
 */
public interface ObjectConverterService {

    /**
     * Convert view model into formatted data in String
     * @param vm view model
     * @return String of converted obj
     */
    String convert(final ViewModel vm);
}
