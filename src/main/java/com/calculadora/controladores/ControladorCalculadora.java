package com.calculadora.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.calculadora.servicios.IServicioCalculadora;
import com.calculadora.utilidades.Rastreador;

import java.math.BigDecimal;

/**
 * Gestiona el método GET /api/calcula
 */
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ControladorCalculadora {

	@Autowired
    private IServicioCalculadora servicioCalculadora;

	@Autowired
	private Rastreador rastreador;

    @GetMapping(value = "/calculadora")
    public ResponseEntity<Object> calcula(@RequestParam(name = "numero1") BigDecimal numero1,
                                          @RequestParam(name = "numero2") BigDecimal numero2,
                                          @RequestParam(name = "operador") String operador) {
    	
    	BigDecimal result = this.servicioCalculadora.calcula(numero1, numero2, operador);
    	rastreador.trace(result);    
        return new ResponseEntity<>(result, HttpStatus.OK);
        
    }        

}
