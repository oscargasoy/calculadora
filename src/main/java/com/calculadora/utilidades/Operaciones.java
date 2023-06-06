package com.calculadora.utilidades;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Operaciones {
    /*TODO se defines todos los signos de operaciones*/
	private final String SUMAR= "sumar";
	private final String DIVIDIR= "dividir";
	private final String RESTAR= "restar";
	private final String MULTIPLICAR= "multiplicar";
	
	private String signo;

	//Constructor
	//Constructor
	public Operaciones() {
    }

	public Operaciones(String signo) {
        this.signo = signo;
    }
	
    //get
	public String getSigno() {
        return this.signo;
    }	
	
    /*TODO añadir operaciones mas complejas en el futuro*/
	private BigDecimal SUMAR(BigDecimal bdNum1,BigDecimal bdNum2) {
		return bdNum1.add(bdNum2);
	}

	private BigDecimal RESTAR(BigDecimal bdNum1,BigDecimal bdNum2) {
		return bdNum1.subtract(bdNum2);
	}

	private BigDecimal DIVIDIR(BigDecimal bdNum1,BigDecimal bdNum2) {
		return bdNum1.divide(bdNum2);
	}

	private BigDecimal MULTIPLICAR(BigDecimal bdNum1,BigDecimal bdNum2) {
		return bdNum1.multiply(bdNum2);
	}	
	
	public BigDecimal RealizarOperacion(BigDecimal bdNum1,BigDecimal bdNum2) {
		BigDecimal bdResultado=new BigDecimal(0);
		String signo=getSigno();
		switch(signo)
		{
			case SUMAR:
				bdResultado=SUMAR(bdNum1,bdNum2); 
			break;
			
			case RESTAR:
				bdResultado=RESTAR(bdNum1,bdNum2); 
			break;

			case DIVIDIR:
				bdResultado=DIVIDIR(bdNum1,bdNum2); 
			break;

			case MULTIPLICAR:
				bdResultado=MULTIPLICAR(bdNum1,bdNum2); 
			break;
			
			default:
				bdResultado=null;

		}
		return bdResultado;
	}
}
