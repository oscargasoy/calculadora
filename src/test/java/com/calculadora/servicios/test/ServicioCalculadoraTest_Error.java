package com.calculadora.servicios.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.calculadora.servicios.IServicioCalculadora;
import com.calculadora.servicios.ServicioCalculadora;

class ServicioCalculadoraTest_Error {
	@Autowired
    private IServicioCalculadora servicioCalculadora;
	
	// Error de operador incorrecto
	@Test
	void Test_Operador_Erroneo() {
		
		BigDecimal numero1=new BigDecimal(2);
		BigDecimal numero2=new BigDecimal(4);
        String operador = "sumatorio";
        
        servicioCalculadora=new ServicioCalculadora();                
        BigDecimal bdresultado = servicioCalculadora.calcula(numero1, numero2, operador);

        Assertions.assertNotEquals(bdresultado,null);
	}
	
	// Error de numero1 incorrecto
	@Test
	void Test_numero1_Erroneo() {
		
		BigDecimal numero2=new BigDecimal(4);
        String operador = "sumar";
        
        servicioCalculadora=new ServicioCalculadora();                
        BigDecimal bdresultado = servicioCalculadora.calcula(null, numero2, operador);

        Assertions.assertNotEquals(bdresultado,null);
	}

	// Error de numero2 incorrecto
	@Test
	void Test_numero2_Erroneo() {
		
		BigDecimal numero1=new BigDecimal(4);
        String operador = "sumar";
        
        servicioCalculadora=new ServicioCalculadora();                
        BigDecimal bdresultado = servicioCalculadora.calcula(numero1,null, operador);

        Assertions.assertNotEquals(bdresultado,null);
	}

}
