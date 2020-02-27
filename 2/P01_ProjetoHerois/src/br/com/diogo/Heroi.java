package br.com.diogo;

public class Heroi {
	private String nome;
	private int forca;
	private int velocidade;
	private int resistencia;
	
	Heroi(){
		System.out.println("Um novo herói nasce!!!");
	}
	
	Heroi(String nome, int forca, int velocidade, int resistencia){
		this.nome = nome;
		this.forca = forca;
		this.velocidade = velocidade;
		this.resistencia = resistencia;
		
		System.out.println("Um novo herói nasce: " + this.nome + ", O destemido");
	}
	
	public void setNome(String nome) {
		if(nome.length() > 1 && nome.length() <= 100) {
			this.nome = nome;
		} else {
			System.err.println("Nome invalido");
			System.exit(0);
		}
	}
	
	public void setForca(int forca) {
		if(forca < 1) {
			this.forca = forca;
		} else {
			System.out.println("Forca Invalida");
			System.exit(0);
		}
	}
	
	
	
	void atacar() {
		System.out.println("Espancando os otários");
	}
	
	void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Froça: " + this.forca);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Resistencia: " + this.resistencia);
	}
}
