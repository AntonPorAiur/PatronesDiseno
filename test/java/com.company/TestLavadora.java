package com.company;

import static org.junit.Assert.*;

import com.company.creational.factorymethod.lavadora.Lavadora;
import com.company.creational.factorymethod.lavadora.LavadoraCargaFrontalFactory;
import com.company.creational.factorymethod.lavadora.LavadoraCargaSuperiorFactory;
import com.company.creational.factorymethod.lavadora.LavadoraFactory;
import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		
		// Los dos metodos de test solo se diferencian en el tipo de factory usado.
		
		LavadoraFactory factory = new LavadoraCargaFrontalFactory();
		
		Lavadora lavadora = factory.crea();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		
		LavadoraFactory factory = new LavadoraCargaSuperiorFactory();
		
		Lavadora lavadora = factory.crea();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
