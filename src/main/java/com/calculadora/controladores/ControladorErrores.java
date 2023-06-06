package com.calculadora.controladores;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

/**
 * Gestiona el método GET /api/calcula
 */
@RestControllerAdvice(annotations = RestController.class)
public class ControladorErrores {
	@ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String NullPointerException(NullPointerException e)
    {
        return e.getMessage();
    }

	@ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String NullPointerException(RuntimeException e)
    {
        return e.getMessage();
    }


}
