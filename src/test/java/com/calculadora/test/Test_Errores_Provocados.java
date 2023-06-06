package com.calculadora.test;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.calculadora.CalculadoraApplication;
import com.calculadora.utilidades.Operaciones;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculadoraApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Test_Errores_Provocados {
		
	// Error de operador incorrecto
	@Test
	void Test_Operador_Erroneo() {
		
		BigDecimal num1=new BigDecimal(2);
		BigDecimal num2=new BigDecimal(4);
        String operador = "sumatorio";
        Operaciones Operaciones = new Operaciones(operador);
        BigDecimal bdresultado=Operaciones.RealizarOperacion(num1,num2);

        Assertions.assertNotEquals(bdresultado,null);
	}
	
	// Error de numero1 incorrecto
	@Test
	void Test_Num1_Erroneo() {
		
		BigDecimal num2=new BigDecimal(4);
        String operador = "sumar";
        Operaciones Operaciones = new Operaciones(operador);
        BigDecimal bdresultado=Operaciones.RealizarOperacion(null,num2);

        Assertions.assertNotEquals(bdresultado,null);
	}

	// Error de numero2 incorrecto
	@Test
	void Test_Num2_Erroneo() {
		
		BigDecimal num1=new BigDecimal(4);
        String operador = "sumar";
        Operaciones Operaciones = new Operaciones(operador);
        BigDecimal bdresultado=Operaciones.RealizarOperacion(num1,null);

        Assertions.assertNotEquals(bdresultado,null);
	}

}
