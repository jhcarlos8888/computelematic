package com.reactive.computelematic.infrastructure.helpers.utility.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@Builder
public class ComponentException extends Exception{
    private static final long serialVersionUID = 1L;

    private final HttpStatus errorHttpStatus;

    private final String errorCodeInternal;

    private final String message;

    private final String location;

}
