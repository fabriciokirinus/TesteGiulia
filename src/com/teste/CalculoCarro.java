package com.teste;

import java.util.Scanner;

public class CalculoCarro {
	public static void main(String[] args) {
		// Define a entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		// Solicita o percurso
		System. out. println("Digite o percurso em KM:"); 
		int percurso = teclado.nextInt();
		
		// Solicita o tipo
		System. out. println("Digite o Tipo de carro:"); 
		String tipoDeCarro = teclado.next();
		
		
		// testa se for diferente de A, B e C e caso de verdadeiro solicita a media
		double media = 0;
		if (!tipoDeCarro.equals("A") && !tipoDeCarro.equals("B") && !tipoDeCarro.equals("C")) {
			System. out. println("Qual a média de Km por litro do carro?"); 
			media = teclado.nextDouble();
		}
		
		// printa a saida com a quantidade de litros calculada 
		// criada a função para calcular
		System.out.println("Quantidade de litros para percorrer o percurso de " + percurso + " é: " + calculoLitros(percurso, tipoDeCarro, media));;
		
		// fechar a variavel teclado
		if (teclado != null) {
			teclado.close();
		}
		
	}

	private static double calculoLitros(int percurso, String tipoDeCarro, double media) {
		// Se a media for maior que zero é porque foi digitado o tipo errado
		
		double resultado = 0;
		
		if (media > 0) {
			resultado = percurso / media;
		} else {
			// tipo A tem media 12
			if (tipoDeCarro.equals("A")) {
				resultado =  percurso / 12;
			// tipo B tem media 9
			} else if (tipoDeCarro.equals("B")) {
				resultado =  percurso / 9;
			// Se não for nem A e nem B tem que ser C senão teria caido no primeiro IF e a media é 8
			} else {
				resultado =  percurso / 8;
			}
		}
		
		return resultado * 2;
	}
}
