package com.calculadora.utilidades;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Operaciones {
    SUMAR("+"),
    RESTAR("-"),
    MULTIPLICAR("*"),
    DIVIDIR("/");
    /*Añadir operaciones mas complejas en el futuro*/

    private static final Operaciones[] valores = new Operaciones[]{SUMAR, RESTAR, MULTIPLICAR, DIVIDIR};

    private String operador;

    Operaciones() {
    }

    Operaciones(String operador) {
        this.operador = operador;
    }

    private String getoperador() {
        return this.operador;
    }

    /**
     * Parsea el parametro String valor en un objeto de tipo Operaciones.
     * El valor del String puede ser tanto el nombre
     * ("suma", "resta"... indiferente mayusculas de minusculas) de la operacion
     * así como el operador ('+', '-', etc.)
     * @param valor
     * @return
     */
    @JsonCreator
    public static Operaciones realizarOperacion(String valor) {

        for (int i = 0; i < valores.length; ++i) {
        	Operaciones opActual = valores[i];
            if (valor.equalsIgnoreCase(opActual.name()) ||
                    valor.equalsIgnoreCase(opActual.getoperador())) {
                return opActual;
            }
        }

        throw new RuntimeException("Operación no soportada para el valor: " + valor);
    }
}