package com.logica;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraNormalTest {
	private Calculadora calc;
	
	@Before
	public void setUp() {
		calc = new CalculadoraNormal("Normal");
	}

	@Test
	public void testValidaTipoCalculadora() {			
		calc.setTipo("Científica");
				
		assertEquals("Científica", calc.getTipo());		
	}
	
	@Test
	public void testSomaDoisValoresPositivos() {
		Double total = calc.soma(45.0, 14.0);
		//System.out.println(total);
		
		assertEquals(59.0, total, 0.0001);
	}
	
	@Test
	public void testSomaDoisValoresNegativos() {				
		Double total = calc.soma(-90.0, -10.0);
		
		assertEquals(-100.0, total, 0.0001);
	}
	
	@Test
	public void testSubtracaoPrimeiroValorMaior() {
		Double total = calc.subtracaoMaiorPeloMenor(45.0, 10.0);
		
		assertEquals(35.0, total, 0.0001);		
	}
	
	@Test
	public void testSubtracaoSegundoValorMaior() {
		Double total = calc.subtracaoMaiorPeloMenor(10.0, 45.0);
		
		assertEquals(35.0, total, 0.0001);		
		
	}
	
	@Test
	public void testDivisaoZero() {
		Double resultado = calc.divisao(45.0, 0.0);
		
		assertEquals(0.0, resultado, 0.0001);
	}
	
	@Test
	public void testDivisaoPositivos() {
		Double resultado = calc.divisao(45.0, 9.0);
		
		assertEquals(5.0, resultado, 0.0001);
	}
}
