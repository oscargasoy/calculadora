package com.calculadora.servicios;

import java.math.BigDecimal;

public interface IServicioCalculadora {

    /**
     * Method is used for calculation for given numbers and operator type
     * Calcula para los números proporcionados como argumentos el resutlado de
     * la operación
     *
     * @param numero1
     * @param numero2
     * @param operador sumar, restar, multiplicar, dividir...
     * @return el resultado de la operación (depende del tipo de operación). Se ha decidido que valor doble
     *              es más que suficiente para representar la operación
     */
	BigDecimal calcula(BigDecimal numero1, BigDecimal numero2, String operador);
}
