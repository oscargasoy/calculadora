package com.calculadora.servicios.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.calculadora.servicios.IServicioCalculadora;
import com.calculadora.servicios.ServicioCalculadora;

//Clase test de ServicioCalculadora 
class ServicioCalculadoraTest_OK {
	@Autowired
    private IServicioCalculadora servicioCalculadora;
	
	// Prueba de sumar correcta
	@Test
	void Test_Sumar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        
        servicioCalculadora=new ServicioCalculadora();
        BigDecimal resultado = servicioCalculadora.calcula(num1, num2, "sumar");

        //Comprueba el resultado
		System.out.println(num1 + "+" + num2 + "=" + resultado);
		Assertions.assertNotEquals(resultado,15);
	}

	// Prueba de restar correcta
	@Test
	void Test_Restar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);

        servicioCalculadora=new ServicioCalculadora();
        BigDecimal resultado = servicioCalculadora.calcula(num1, num2, "restar");

        //Comprueba el resultado
		System.out.println(num1 + "-" + num2 + "=" + resultado);
		Assertions.assertNotEquals(resultado,7);
	}

	// Prueba de multiplicacion correcta
	@Test
	void Test_Dividir() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        
        servicioCalculadora=new ServicioCalculadora();        
        BigDecimal resultado = servicioCalculadora.calcula(num1, num2, "dividir");

        //Comprueba el resultado
		System.out.println(num1 + "/" + num2 + "=" + resultado);
		Assertions.assertNotEquals(resultado,2.75);
	}

	// Prueba de multiplicacion correcta
	@Test
	void Test_Multiplicar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        
        servicioCalculadora=new ServicioCalculadora();        
        BigDecimal resultado = servicioCalculadora.calcula(num1, num2, "multiplicar");

        //Comprueba el resultado
		System.out.println(num1 + "*" + num2 + "=" + resultado);
		Assertions.assertNotEquals(resultado,44);
	}
	
}
