package com.calculadora.controladores;

<<<<<<< HEAD
import io.corp.calculator.TracerImpl;
=======
>>>>>>> 83ef775 (segundo commit)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.calculadora.servicios.IServicioCalculadora;
<<<<<<< HEAD
=======
import com.calculadora.utilidades.Rastreador;
>>>>>>> 83ef775 (segundo commit)

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

<<<<<<< HEAD
    private TracerImpl tracer = new TracerImpl();

    @GetMapping(value = "/calculadora")
    public ResponseEntity<Object> calcula(@RequestParam(name = "numero1") BigDecimal Numero1,
                                            @RequestParam(name = "numero2") BigDecimal Numero2,
                                            @RequestParam(name = "operador") String operador) {
    	
        double result = this.servicioCalculadora.calcula(Numero1, Numero2, operador);
        tracer.trace(result);        
=======
	@Autowired
	private Rastreador rastreador;

    @GetMapping(value = "/calculadora")
    public ResponseEntity<Object> calcula(@RequestParam(name = "numero1") BigDecimal numero1,
                                            @RequestParam(name = "numero2") BigDecimal numero2,
                                            @RequestParam(name = "operador") String operador) {
    	
    	BigDecimal result = this.servicioCalculadora.calcula(numero1, numero2, operador);
    	rastreador.trace(result);
>>>>>>> 83ef775 (segundo commit)
        return new ResponseEntity<>(result, HttpStatus.OK);
        
    }        

}
