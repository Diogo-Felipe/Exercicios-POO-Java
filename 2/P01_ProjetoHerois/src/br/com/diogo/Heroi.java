package br.com.diogo;

public class Heroi {
	String nome;
	int forca;
	int velocidade;
	int resistencia;
	
	Heroi(){
		System.out.println("Um novo her�i nasce!!!");
	}
	
	Heroi(String nome, int forca, int velocidade, int resistencia){
		this.nome = nome;
		this.forca = forca;
		this.velocidade = velocidade;
		this.resistencia = resistencia;
		
		System.out.println("Um novo her�i nasce: " + this.nome + ", O destemido");
	}
	
	void bater() {
		System.out.println("Batendo");
	}
}
