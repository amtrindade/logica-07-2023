package com.logica;

public abstract class Calculadora {
		
	public Calculadora(String tipo) {	
		this.tipo = tipo;
	}

	private String tipo;	

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double soma(Double valor1, Double valor2) {
		Double total = valor1 + valor2;
		return total;
	}
	
	public Double subtracaoMaiorPeloMenor(Double valor1, Double valor2) {
		Double total;
		if (valor1 >= valor2) {
			total = valor1 - valor2;
		}
		else {
			total = valor2 - valor1;
		}	
		return total;			
	}
	
	public Double divisao(Double dividendo, Double divisor) {
		Double total;
		if (divisor == 0.0) {
			total = 0.0;
		}
		else {
			total = dividendo / divisor;
		}
		return total;	
	}	

}
