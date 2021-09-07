package com.company.structural.decorator.logger;

import java.util.List;

public interface BaseDatos {

	void inserta (String registro);
	
	List<String> registros();
}
