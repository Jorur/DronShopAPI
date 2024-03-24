package org.dronshopapi.dronshopapi.exception;

import lombok.Getter;

import static java.lang.Long.parseLong;

@Getter
public class ResourceNotFoundException extends RuntimeException{
    private final String resourceName;
    private final String fieldName;
    private final Long fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = parseLong(fieldValue);
    }
}
