package com.calculadora.utilidades;

import org.springframework.stereotype.Component;

import io.corp.calculator.TracerAPI;
import io.corp.calculator.TracerImpl;

/**
 * 
 * @author Oscar Gandul Alonso
 *
 */
@Component
public class Rastreador implements TracerAPI {

	private TracerImpl tracerImpl;
	
	public Rastreador() {
		tracerImpl = new TracerImpl();
	}

	@Override
	public <T> void trace(T result) {
		this.tracerImpl.trace(result);
	}

}