package com.calculadora.servicios;

import java.math.BigDecimal;

public interface IServicioCalculadora {

    /**
     * Method is used for calculation for given numbers and operator type
     * Calcula para los números proporcionados como argumentos el resutlado de
     * la operación
     *
<<<<<<< HEAD
     * @param Numero1
     * @param Numero2
=======
     * @param numero1
     * @param numero2
>>>>>>> 83ef775 (segundo commit)
     * @param operador sumar, restar, multiplicar, dividir...
     * @return el resultado de la operación (depende del tipo de operación). Se ha decidido que valor doble
     *              es más que suficiente para representar la operación
     */
<<<<<<< HEAD
    double calcula(BigDecimal Numero1, BigDecimal Numero2, String operador);
=======
	BigDecimal calcula(BigDecimal numero1, BigDecimal numero2, String operador);
>>>>>>> 83ef775 (segundo commit)
}
