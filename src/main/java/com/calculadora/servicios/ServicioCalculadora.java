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
     * @param Numero1
     * @param Numero2
     * @param operador
     * @return
     */
    @Override
    public double calcula(BigDecimal Numero1, BigDecimal Numero2, String operador) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Calculando resultado para : {} {} {}", Numero1, Numero2, operador);
        }

        Operaciones Operaciones = new Operaciones(operador);

        if(Operaciones == null) {
            throw new RuntimeException("Operación imposible de procesar: " + operador);
        }
        
        return Operaciones.RealizarOperacion(Numero1,Numero2).doubleValue();
    }
}
