package com.company.structural.decorator.logger;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	private final BaseDatos baseDatos;
	private final Logger logger;

	public LoggerDecorator(BaseDatos baseDatos, Logger logger) {
		this.baseDatos = baseDatos;
		this.logger = logger;
	}

	@Override
	public void inserta(String registro) {
		// implementar
		logger.add("inserta" + registro);
		baseDatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		// implementar
		logger.add("lectura");
		return baseDatos.registros();
	}


}
