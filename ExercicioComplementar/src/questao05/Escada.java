package questao05;

import java.util.Scanner;

// Escreva um programa que mostra como saída uma “escada” formada por asteriscos (*) com uma 
// quantidade de degraus especificada pelo usuário.
public class Escada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantidade de degraus: ");
		int degraus = input.nextInt();
		
		for (int i = degraus; i >= 0; i--) {
			for (int j = 0; j < degraus; j++) {
				if ((j > i) || (j == i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		input.close();

	}

}
