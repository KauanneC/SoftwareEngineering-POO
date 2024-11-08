package questao06;

public class Arvore {

	int idade;
	String nome;
	int idade_max;
	double tamanho;
	
	public Arvore(int idade, String nome, int idade_max, double tamanho) {
		this.idade = idade;
		this.nome  = nome;
		this.idade_max = idade_max;
		this.tamanho = tamanho;
	}
	
	public void envelhecer() {
		idade += 1;
		tamanho += 0.50;
		
		System.out.println("\nIdade: " + idade + " anos");
		System.out.println("Tamanho: " + tamanho + "m");
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade_max() {
		return idade_max;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade_max(int idade_max) {
		this.idade_max = idade_max;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
