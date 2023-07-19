package com.logica;

import java.util.ArrayList;
import java.util.List;

public class Variaveis {
	
	public static void main(String[] args) {
		
		//Variáveis do tipo String
		String nome1 = "Hello";
		String nome2 = "World!";
		
		imprime(nome1 +" "+ nome2);
		
		//Variáveis do tipo Double
		Double numero1 = 45.90;
		Double numero2 = 55.90;			
		
		//Qual o maior número
		if (numero1 > numero2) {
			imprime("O número 1 é maior que o número 2");
			imprime(numero1.toString());
		}
		else if (numero1 < numero2) {
			imprime("O número 2 é maior que o número 1");
			imprime(numero2.toString());
		}
		else {
			imprime("Os números são iguais");
			imprime(numero1.toString());
		}	
		
		//Variáveis do tipo Integer
		Integer numero3 = 1100;
		imprime("Imprime número inteiro: "+ numero3.toString());
		
		//Variáveis do tipo Boolean
		Boolean numero2MaiorNumero1 = numero2 > numero1;		
		
		if (numero2MaiorNumero1) {
			imprime("O número 2 é maior que o número 1");
		}
		else {
			imprime("O número 1 é maior ou igual ao número 2");
		}
		
		//looping com for valor inicial e final
		for (int i = 1; i <= 10; i++) {
			imprime("Looping com for "+ i);
		}
		
		//looping com while condição
		int i = 1;
		while (i <= 10) {
			imprime("Looping com while "+ i);
			i++;
		}
		
		//Looping em listas
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("Monitor LG 34'");
		produtos.add("Teclado Logitech");
		produtos.add("Mouse sem fio");
		produtos.add("WebCan Logi");
		produtos.add("Monitor LG 29'");
		
		imprime("O tamanho da lista é: "+ produtos.size());
		
		for (String produto : produtos) {
			imprime("O produto é: "+ produto);
		}						
	}
	
	private static void imprime(String valor) {		 
		System.out.println(valor);
	}
}
