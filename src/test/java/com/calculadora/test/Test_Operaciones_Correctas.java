package com.calculadora.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.calculadora.CalculadoraApplication;
import com.calculadora.servicios.IServicioCalculadora;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculadoraApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Test_Operaciones_Correctas {
	@Autowired
    private IServicioCalculadora servicioCalculadora;
	
	// Prueba de sumar correcta
	@Test
	void Test_Sumar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        double resultado = servicioCalculadora.calcula(num1, num2, "sumar");

        //Comprueba el resultado
		System.out.println(num1 + "*" + num2 + "=" + resultado);
		Assertions.assertEquals(resultado,15);
	}

	// Prueba de restar correcta
	@Test
	void Test_Restar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        double resultado = servicioCalculadora.calcula(num1, num2, "restar");

        //Comprueba el resultado
		System.out.println(num1 + "*" + num2 + "=" + resultado);
		Assertions.assertEquals(resultado,7);
	}

	// Prueba de multiplicacion correcta
	@Test
	void Test_Dividir() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        double resultado = servicioCalculadora.calcula(num1, num2, "dividir");

        //Comprueba el resultado
		System.out.println(num1 + "*" + num2 + "=" + resultado);
		Assertions.assertEquals(resultado,2.75);
	}

	// Prueba de multiplicacion correcta
	@Test
	void Test_Multiplicar() {

        BigDecimal num1=new BigDecimal(11);
        BigDecimal num2=new BigDecimal(4);
        double resultado = servicioCalculadora.calcula(num1, num2, "multiplicar");

        //Comprueba el resultado
		System.out.println(num1 + "*" + num2 + "=" + resultado);
		Assertions.assertEquals(resultado,44);
	}
	
}
