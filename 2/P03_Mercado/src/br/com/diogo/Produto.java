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
		if(nome.length() > 1) {
			this.nome = nome;	
		} else {
			System.err.println("Nome muito curto");
		}
		
	}
	
	
	public double getPreco() {
		System.out.println("O preço do produto: " + this.preco);
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.err.println("Preço Invalido");
		}	
	}
	
	
	public double getPeso() {
		System.out.println("O peso do produto: " + this.peso);
		return this.peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		} else {
			System.err.println("Peso Invalido");
		}
		
		
	}
	
	

	
}
