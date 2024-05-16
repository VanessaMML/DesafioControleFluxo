package com.controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leitor.nextInt();
		
		try {
			contar (numero1, numero2);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O primeiro n�mero deve ser menor que o segundo n�mero.");
		}
		
		leitor.close();
		
	}
	
	public static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
		if (numero1 > numero2) {
			System.out.println("O primeiro n�mero deve ser menor que o segundo n�mero.");
		}else {
			int contagem = numero2 - numero1;
			for (int i = 0; i <= contagem; i++) {
					System.out.println(i);
			}
		
		}
	}
}

