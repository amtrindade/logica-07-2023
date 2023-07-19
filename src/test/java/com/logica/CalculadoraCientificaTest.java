package com.logica;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraCientificaTest {
	private CalculadoraCientifica calculadoraCientifica;
	
	@Before
	public void setUp() {
		calculadoraCientifica = new CalculadoraCientifica("Científica");
	}
	
	@Test
	public void testFatorialDeCinco() {		
		Integer resultado = calculadoraCientifica.fatorial(5);
		assertEquals(120, resultado, 0.01);		
	}
	
	@Test
	public void testFatorialDeQuatro() {
		Integer resultado = calculadoraCientifica.fatorial(4);
		assertEquals(24, resultado, 0.01);		
	}
	
	@Test
	public void testFatorialZero() {
		Integer resultado = calculadoraCientifica.fatorial(0);
		assertEquals(-1, resultado, 0.01);
	}
	
	@Test
	public void testFatorialNegativo() {
		Integer resultado = calculadoraCientifica.fatorial(-1);
		assertEquals(-1, resultado, 0.01);
	}

}
