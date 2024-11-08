package questao07;

import java.util.Random;

public class Heroi {
	
	int vida_atual;
	int vida_max;
	int magia_atual;
	int magia_max;
	String nome;
	int dado;

	Random gerador = new Random();
	
	public Heroi(String nome, int vida_atual, int vida_max, int magia_atual, int magia_max) {
		this.nome = nome;
		this.vida_atual = vida_atual;
		this.vida_max = vida_max;
		this.magia_atual = magia_atual;
		this.magia_max = magia_max;
	}

	public int receberDano(int dano) {
		if (dano < vida_atual) {
			vida_atual -= dano;
		} else {
			vida_atual = 0;
		}
		return vida_atual;
	}
	
	public int usarMagia(int quantidade) {
		if (quantidade < magia_atual) {
			magia_atual -= quantidade;
		} else {
			magia_atual = 0;
		}
		return magia_atual;
	}
	
	public int recuperarVida(int quantidade) {
		vida_atual += quantidade;
		
		if (vida_atual > vida_max) {
			vida_atual = vida_max;
		}
		
		return vida_atual;
	}
	
	public int recuperarMagia(int quantidade) {
		magia_atual += quantidade;
		
		if (magia_atual > magia_max) {
			magia_atual = magia_max;
		}
		
		return magia_atual;
	}
	
	public int rolarDados(int quantidade) {
		return gerador.nextInt(quantidade);
	}
	
	
	public int getVida_atual() {
		return vida_atual;
	}
	
	public int getVida_max() {
		return vida_max;
	}
	
	public int getMagia_atual() {
		return magia_atual;
	}
	
	public int getMagia_max() {
		return magia_max;
	}
	
	public String getNome() {
		return nome;
	}

	public void setVida_atual(int vida_atual) {
		this.vida_atual = vida_atual;
	}

	public void setVida_max(int vida_max) {
		this.vida_max = vida_max;
	}
	
	public void setMagia_atual(int magia_atual) {
		this.magia_atual = magia_atual;
	}

	public void setMagia_max(int magia_max) {
		this.magia_max = magia_max;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}