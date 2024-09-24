package com.reactive.computelematic.infrastructure.configurations.error;



import com.reactive.computelematic.infrastructure.helpers.utility.error.ComponentException;
import com.reactive.computelematic.infrastructure.helpers.utility.error.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleException(Exception ex) {
        // Obtén la pila de llamadas (stack trace) de la excepción
        StackTraceElement[] stackTraceElements = ex.getStackTrace();

        // Extrae la información del primer elemento de la pila de llamadas
        String className = stackTraceElements[0].getClassName();
        String methodName = stackTraceElements[0].getMethodName();
        int lineNumber = stackTraceElements[0].getLineNumber();

        // Construye una respuesta de error JSON
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
        errorDTO.setMessage(ex.getMessage());
        errorDTO.setLocation("Excepción en: " + className + "." + methodName + "() [Línea " + lineNumber + "]");
        return new ResponseEntity<>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ComponentException.class)
    public ResponseEntity<ErrorDTO> handleCustomException(ComponentException ex) {
        // Construye una respuesta de error JSON personalizada
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setCode(ex.getErrorCodeInternal());
        errorDTO.setMessage(ex.getMessage());
        errorDTO.setLocation(ex.getLocation());
        return new ResponseEntity<>(errorDTO, ex.getErrorHttpStatus());
    }


}
