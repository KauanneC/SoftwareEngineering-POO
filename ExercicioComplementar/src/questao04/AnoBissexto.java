package questao04;

import java.util.Scanner;

// Crie um programa que verifica se o ano digitado pelo usuário no console é bissexto. Se o ano for bissexto, a mensagem 
// "xxxx é bissexto" (onde xxxx é o ano digitado pelo  usuário) deve ser impressa, caso contrário a mensagem "xxxx não é bissexto" 
// deve aparecer no console. Se o usuário digitar um número negativo, imprima "xxxx não é um ano válido". 
public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o ano: ");
		int ano = input.nextInt();
		
		if (ano < 0) {
			System.out.println(ano + " não é um ano válido");
		} else {
			if (ano % 4 == 0) {
				if (ano % 100 == 0) {
					if (ano % 400 == 0) {
						System.out.println(ano + " é bissexto");
					} else {
						System.out.println(ano + " não é bissexto");
					}
				} else {
					System.out.println(ano + " é bissexto");
				}
			}
		}
		
		input.close();

	}

}
