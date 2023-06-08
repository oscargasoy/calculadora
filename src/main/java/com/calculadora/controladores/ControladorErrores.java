package com.calculadora.controladores;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Gestiona el método GET /api/calcula
 */
@RestControllerAdvice(annotations = RestController.class)
public class ControladorErrores {
	@ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> NullPointerException(NullPointerException e)
    {
		return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

	@ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public  ResponseEntity<Object> NullPointerException(RuntimeException e)
    {
		return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
