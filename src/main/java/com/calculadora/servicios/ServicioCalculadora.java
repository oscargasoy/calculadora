package com.calculadora.servicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.calculadora.utilidades.Operaciones;

import java.math.BigDecimal;

/**
 * Implementación básica de la interfaz {@link IServicioCalculadora}
 */
@Service
public class ServicioCalculadora implements IServicioCalculadora {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicioCalculadora.class);


    /**
     * Intentamos convertir la operación, sino podemos lanzamos un error,
     * y realizamos la operación correspondiente
     * @param numero1
     * @param numero2
     * @param operador
     * @return
     */
    @Override
    public BigDecimal calcula(BigDecimal numero1, BigDecimal numero2, String operador) {

    	if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Calculando resultado para : {} {} {}", numero1, numero2, operador);
        }

        Operaciones operacion = Operaciones.realizarOperacion(operador);

        if(operacion == null) {
            throw new RuntimeException("Operación imposible de procesar: " + operador);
        }

        switch (operacion) {
            case SUMAR:
                return numero1.add(numero2);
            case RESTAR:
                return numero1.subtract(numero2);
            case MULTIPLICAR:
                return numero1.multiply(numero2);
            case DIVIDIR:
                return numero1.divide(numero2);
            default:
                if(LOGGER.isErrorEnabled()) {
                    LOGGER.error("Operación no soportada para ser calculada: {}", operacion);
                }
                throw new RuntimeException("Operación no soportada para ser calculada: " + operacion.toString());

        }
    }
}
