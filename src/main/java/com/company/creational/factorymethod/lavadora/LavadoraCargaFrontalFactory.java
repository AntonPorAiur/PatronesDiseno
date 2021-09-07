package com.company.creational.factorymethod.lavadora;

public class LavadoraCargaFrontalFactory extends LavadoraFactory {

	@Override
	protected Lavadora creaLavadora() {
		return new LavadoraCargaFrontal();
	}

}
