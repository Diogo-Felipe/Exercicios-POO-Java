package br.com.diogo;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto("feijão", 3.50, 1000);
	
		p1.setNome("Arroz");
		p1.setPeso(1000);
		p1.setPreco(3.50);
		
		p1.getAtributos();
		p2.getAtributos();
		
		double novoPrecoP1 = p1.aplicaDesconto(10);
		double novoPrecoP2 = p2.aplicaDesconto(7);
		
		System.out.println("Novo preço de " + p1.getNome() + ": " + novoPrecoP1);
		System.out.println("Novo preço de " + p2.getNome() + ": " + novoPrecoP2);
		
	}
	

}
