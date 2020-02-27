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
		setNome(nome);
		setForca(forca);
		setVelocidade(velocidade);
		setResistencia(resistencia);
		
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
	
	public String getNome() {
		return this.nome;
	}
	
	public void setForca(int forca) {
		if(forca > 1) {
			this.forca = forca;
		} else {
			System.out.println("Forca Invalida");
			System.exit(0);
		}
	}
	
	public int getForca() {
		return this.forca;
	}
	
	public void setVelocidade(int velocidade) {
		if(velocidade > 1) {
			this.velocidade = velocidade;
		} else {
			System.out.println("Velocidade Invalida");
			System.exit(0);
		}
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void setResistencia(int resistencia) {
		if(resistencia > 1) {
			this.resistencia = resistencia;
		} else {
			System.out.println("Resistência Invalida");
			System.exit(0);
		}
	}
	
	public int getResistecia() {
		return this.resistencia;
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
