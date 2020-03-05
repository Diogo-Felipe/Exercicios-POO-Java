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
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.err.println("Pre�o Invalido");
		}	
	}
	
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		} else {
			System.err.println("Peso Invalido");
		}
		
		
	}
	
	
	public double aplicaDesconto(double porcentagemDesconto) {
		double novoValor;
		
		novoValor = (porcentagemDesconto / 100) * this.getPreco();
		
		System.out.println("Valor com desconto de " + porcentagemDesconto + ": " + novoValor);
		
		return novoValor;
	}
	
}