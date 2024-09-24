package com.reactive.computelematic.infrastructure.helpers.utility.error;

import lombok.Data;

@Data
public class ErrorDTO {
    private String code;

    private String message;

    private String location;
}
