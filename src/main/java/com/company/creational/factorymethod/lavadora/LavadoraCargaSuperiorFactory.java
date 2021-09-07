package com.company.creational.factorymethod.lavadora;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

	@Override
	protected Lavadora creaLavadora() {
		return new LavadoraCargaSuperior();
	}

}
