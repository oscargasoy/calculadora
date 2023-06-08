package com.calculadora.controladores;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;
<<<<<<< HEAD
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 83ef775 (segundo commit)

/**
 * Gestiona el método GET /api/calcula
 */
@RestControllerAdvice(annotations = RestController.class)
public class ControladorErrores {
	@ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
<<<<<<< HEAD
	public String NullPointerException(NullPointerException e)
    {
        return e.getMessage();
=======
	public ResponseEntity<Object> NullPointerException(NullPointerException e)
    {
		return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
>>>>>>> 83ef775 (segundo commit)
    }

	@ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
<<<<<<< HEAD
	public String NullPointerException(RuntimeException e)
    {
        return e.getMessage();
=======
	public  ResponseEntity<Object> NullPointerException(RuntimeException e)
    {
		return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
>>>>>>> 83ef775 (segundo commit)
    }


}
