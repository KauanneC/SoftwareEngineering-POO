package questao01;

import java.util.Random;
import java.util.Scanner;

// Escreva um programa que recebe três números inteiros e informe quantos são pares e qual o menor, 
// depois gere um número aleatório (de 0 a 10) e diga se divide o menor valor dos três. 
public class Number {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		System.out.println("Informe 3 números inteiros:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int quant_par = 0;
		int menor = 0;
		int aleatorio = gerador.nextInt(11);
		
		if (num1 % 2 == 0 ) {
			quant_par += 1;
		} 
		if (num2 % 2 == 0) {
			quant_par += 1;
		} 
		if (num3 % 2 == 0) {
			quant_par += 1;
		} 

		if ((num1 < num2) && (num1 < num3)) {
			menor = num1;
		} else if ((num3 < num1) && (num3 < num2)) {
			menor = num3;
		} else {
			menor = num2;
		}
				
		System.out.println("Quantidade de númmeros pares: " + quant_par);
		System.out.println("Menor número: " + menor);
		
		if (aleatorio % menor == 0) {
			System.out.println("O número aleatório " + aleatorio + " é divisível por " + menor);
		} else {
			System.out.println("O número aleatório " + aleatorio + " não é divisível por " + menor);
		}
		
		input.close();
		
	}

}
