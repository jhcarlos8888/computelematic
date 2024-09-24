package com.reactive.computelematic.infrastructure.helpers.utility.error;

import java.util.Arrays;

public enum CodeTypeError {
    ERROR_INESPERADO("0001"), ERROR_PARAMETROS_INCORRECTOS("0002"), RECURSO_NO_ENCONTRADO("0280"),
    ERROR_PARAMETROS_HI("0003"), SIN_INFORMACION("0281"), PETICION_INCORRECTA("0004"), OPERACION_FALLIDA("0285"),
    REQUEST_IMCOMPLETO("0286"), DELETE_ELEMENT_FAILED_THIS_ENTITY_CONTAIN_RELATIONS("0287"),
    VALORES_NO_VALIDOS("0009"), ERROR_ALREADY_CREATED_IN_DB("0290"),CORREOS_DUPLICADOS("0293"),
    ERROR_AUTHENTICATION("0443"), ERROR_VLANS("0445"), ERROR_EQUIPO("0446"),
    DATOS_A_ACTUALIZAR_SE_ENCUENTRAN_PREVIAMENTEN_REGISTRADOS("0288"),
    INVALID_EXTENSION_FILE("0500"),INVALID_FILE_NAME("0501"),
    INVALID_DATE_TODAY("0502"),FILE_TOO_LARGE("0503"),
    INVALID_FILE_STRUCTURE("0504"), DUPLICATE_ROWS("0505"),
    FILE_READ_ERROR("0506"), ERROR_CREATE_CARGA_BASE("0507"),
    INVALID_NULL_FILE("0508"), FILE_IS_EMPTY("0509");



    private final String code;

    private CodeTypeError(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static CodeTypeError getEnumByCode(String code) {
        return Arrays.asList(CodeTypeError.values()).stream().filter(et -> et.getCode().equalsIgnoreCase(code))
                .findFirst().orElse(null);
    }
}
