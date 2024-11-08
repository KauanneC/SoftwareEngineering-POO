package questao03;

import java.util.Scanner;

// Seja uma equação do segundo grau, no formato ax2 + bx + c, faça um programa que receba os coeficientes (a, b, c) e 
// informe as raízes, exceto no caso de raiz complexa. Pesquise na API de Java como calcular a raiz quadrada.
public class Equacao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe os coeficientes a, b e c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double delta = (b*b) - 4 * a * c;
		double res_raiz = 0;
		
		if (delta > 0) {
			res_raiz = (Math.sqrt(delta));
			System.out.printf("\nRaíz = %.2f", res_raiz);
		} else if (delta == 0) {
			res_raiz = (Math.sqrt(delta));
			System.out.println("Raíz = " + res_raiz);
		} else {
			System.out.println("A raíz é complexa");
		}
		
		input.close();
	}
}
