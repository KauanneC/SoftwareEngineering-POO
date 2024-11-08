package questao06;

public class TesteArvore {

	public static void main(String[] args) {
		
		Arvore arvore = new Arvore(2, "Amabel", 10, 1.15);
		
		System.out.println("Nome: " + arvore.nome);
		System.out.println("Idade: " + arvore.idade + " anos");
		System.out.println("Tamanho: " + arvore.tamanho + "m");
		
		while (arvore.idade < arvore.idade_max) {
			arvore.envelhecer();
		}
		
		System.out.println("\n" + arvore.nome + " morreu! :(");
	}

}
