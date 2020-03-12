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
		this.setPeso(peso);
		this.setPreco(preco);
		
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
			System.err.println("Preço Invalido");
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
	
	public void getAtributos() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preco: " + this.preco);
		System.out.println("Peso: " + this.peso);
	}
	
	
	public double aplicaDesconto(double porcentagemDesconto) {
		double novoValor;
		
		novoValor = this.getPreco() - (porcentagemDesconto / 100) * this.getPreco();
		
		return novoValor;
	}
	
}
