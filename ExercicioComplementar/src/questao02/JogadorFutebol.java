package questao02;

import java.util.Scanner;

// Faça um programa que dada a idade de um jogador de futebol, classifique-o em uma das seguintes categoriass
public class JogadorFutebol {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a idade do jogador?");
		int idade = input.nextInt();
		
		if (idade < 14) {
			System.out.println("Não existe categoria para essa idade");
		} else if ((idade == 14) && (idade == 15)) {
			System.out.println("Categoria: Infantil");
		} else if ((idade == 16) && (idade == 17)) {
			System.out.println("Categoria: Juvenil");
		} else if ((idade >= 18) && (idade <= 20)) {
			System.out.println("Categoria: Júnior");
		} else if (idade > 20) {
			System.out.println("Categoria: Profissional");
		} else {
			System.out.println("Erro!");
		}
		
		input.close();

	}

}
