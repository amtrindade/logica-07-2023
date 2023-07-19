package com.logica;

public class CalculadoraCientifica extends Calculadora{
	
	public CalculadoraCientifica(String tipo) {
		super(tipo);		
	}

	public Integer fatorial(Integer valor) {
		Integer fatorial = 1;
		
		if (valor <= 0) {
			fatorial = -1;
		}		
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;			
		}
		
		return fatorial; 
	}
}
