package br.com.diogo;

public class Produto {
	
	private String nome;
	private double preco, peso;
	
	Produto(){
		System.out.println("Produto Instanciado");
	}
	
	Produto(String nome, double preco, double peso){
		System.out.println("Produto Instanciado Com Parametros");
		this.setNome(nome);
		
	}
	
	public String getNome() {
		System.out.println("Nome do produto: " + this.nome);
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public double getPreco() {
		System.out.println("O preço do produto: " + this.preco);
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public double getPeso() {
		System.out.println("O peso do produto: " + this.peso);
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
