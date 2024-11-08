package questao07;

public class JogoHeroi {

	public static void main(String[] args) {
		
		int i = 0;
		
		Heroi heroi1 = new Heroi("Capitão América", 100, 100, 50, 50);
		Heroi heroi2 = new Heroi("Homem de Ferro", 100, 100, 50, 50);
		
		System.out.println("O jogo começou!");
		System.out.println("O maior número aleatório começará!");
		
		int dado1 = heroi1.rolarDados(25);
		int dado2 = heroi2.rolarDados(25);
		
		System.out.println("\n" + heroi1.nome + " tirou " + dado1);
		System.out.println(heroi2.nome + " tirou " + dado2);
		
		if (dado1 > dado2) {
			System.out.println("\n" + heroi1.nome + " começará.");
			System.out.println("\nRolando dados...");
			
			System.out.println("\nMagia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
			System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
			
			while (i < 4) {
				
				int opcao = heroi1.rolarDados(4);
				System.out.println("\n" + heroi1.nome + " vai: \n1. recuperar vida \n2. atacar \n3. recuperar magia");
				
				switch(opcao) {
				case 1:
					dado1 = heroi1.rolarDados(25);
					heroi1.recuperarVida(dado1);
					System.out.println("\n" + heroi1.nome + " recuperou " + dado1 + " de vida");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					break;
				case 2:
					dado1 = heroi1.rolarDados(25);
					heroi2.receberDano(dado1);
					System.out.println("\n" + heroi1.nome + " disparou " + dado1 + " de magia");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					if (heroi2.vida_atual == 0) {
						i = 4;
					}
					break;
				case 3: 
					dado1 = heroi1.rolarDados(25);
					heroi1.recuperarMagia(dado1);
					System.out.println("\n" + heroi1.nome + " recuperou " + dado1 + " de magia");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					break;
				default:
					System.out.println("\n" + heroi1.nome + " perdeu a vez");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					break;
				}
				
				System.out.println("\n" + heroi2.nome + " vai: \n1. recuperar vida \n2. atacar \n3. recuperar magia");
				
				opcao = heroi2.rolarDados(4);
				
				switch(opcao) {
					case 1:
						dado2 = heroi2.rolarDados(25);
						heroi2.recuperarVida(dado2);
						System.out.println("\n" + heroi2.nome + " recuperou " + dado2 + " de vida");
						System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
						System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
						break;
					case 2:
						dado2 = heroi2.rolarDados(25);
						heroi1.receberDano(dado2);
						System.out.println("\n" + heroi2.nome + " dispaou " + dado2 + " de magia");
						System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
						System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
						if (heroi1.vida_atual == 0) {
							i = 4;
						}
						break;
					case 3:
						dado2 = heroi2.rolarDados(25);
						heroi2.recuperarMagia(dado2);
						System.out.println("\n" + heroi2.nome + " está com " + heroi2.magia_atual + " de magia");
						System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
						System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
						break;
					default:
						System.out.println("\n" + heroi2.nome + " perdeu a vez");
						System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
						System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
						break;
				}
				
				i++;
			}
			
			if (heroi1.vida_atual > heroi2.vida_atual) {
				System.out.println("\n" + heroi1.nome + " VENCEU!!");
			} else {
				System.out.println("\n" + heroi2.nome + " VENCEU!!");
			}
			
		} else {
			System.out.println("\n" + heroi2.nome + " começará.");
			System.out.println("\nRolando dados...");
			
			System.out.println("\nMagia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
			System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
			
			while (i < 4) {
				
				int opcao = heroi2.rolarDados(4);
				System.out.println("\n" + heroi2.nome + " vai: \n1. recuperar vida \n2. atacar \n3. recuperar magia");
				
				switch(opcao) {
				case 1:
					dado2 = heroi2.rolarDados(25);
					heroi2.recuperarVida(dado2);
					System.out.println("\n" + heroi2.nome + " recuperou " + dado2 + " de vida");
					System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
					System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
					break;
				case 2:
					dado2 = heroi2.rolarDados(25);
					heroi1.receberDano(dado2);
					System.out.println("\n" + heroi2.nome + " dispaou " + dado2 + " de magia");
					System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
					System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
					if (heroi1.vida_atual == 0) {
						i = 4;
					}
					break;
				case 3:
					dado2 = heroi2.rolarDados(25);
					heroi2.recuperarMagia(dado2);
					System.out.println("\n" + heroi2.nome + " recuperou " + dado2 + " de magia");
					System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
					System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
					break;
				default:
					System.out.println("\n" + heroi2.nome + " perdeu a vez");
					System.out.println("Magia do " + heroi2.nome + ": " +  heroi2.magia_atual + "/" + heroi2.magia_max);
					System.out.println("Vida do " + heroi2.nome + ": " +  heroi2.vida_atual + "/" + heroi2.vida_max);
					break;
				}
				
				System.out.println("\n" + heroi1.nome + " vai: \n1. recuperar vida \n2. atacar \n3. recuperar magia");
				opcao = heroi1.rolarDados(4);
				
				switch(opcao) {
				case 1:
					dado1 = heroi1.rolarDados(25);
					heroi1.recuperarVida(dado1);
					System.out.println("\n" + heroi1.nome + " recuperou " + dado1 + " de vida");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					break;
				case 2:
					dado1 = heroi1.rolarDados(25);
					heroi2.receberDano(dado1);
					System.out.println("\n" + heroi1.nome + " disparou " + dado1 + " de magia");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					if (heroi2.vida_atual == 0) {
						i = 4;
					}
					break;
				case 3: 
					dado1 = heroi1.rolarDados(25);
					heroi1.recuperarMagia(dado1);
					System.out.println("\n" + heroi1.nome + " recuperou " + dado1 + " de magia");
					System.out.println("Magia do " + heroi1.nome + ": " +  heroi1.magia_atual + "/" + heroi1.magia_max);
					System.out.println("Vida do " + heroi1.nome + ": " +  heroi1.vida_atual + "/" + heroi1.vida_max);
					break;
				default:
					System.out.println("\n" + heroi1.nome + " perdeu a vez");
					break;
				}
				
				i++;
			}
			
			if (heroi1.vida_atual > heroi2.vida_atual) {
				System.out.println("\n" + heroi1.nome + " VENCEU!!");
			} else {
				System.out.println("\n" + heroi2.nome + " VENCEU!!");
			}
		}
		
	}

}
