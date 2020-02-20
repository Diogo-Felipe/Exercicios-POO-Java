package br.com.diogo;

public class Crianca {
	//Atributos
	String nome;
	String corCabelo;
	String corPele;
	double altura;
	int idade;
	
	//Métodos
	void brincar() {
		System.out.println("Brincando...");
	}
	void correr(double metros) {
		System.out.println("Correndo por: " + metros + " metros");
	}
	void nadar(double metros) {
		System.out.println("Nadando por: " + metros + "metros");
	}
	String sorrir() {
		return ":)";
	}
	void imprimirAtributos() {
		System.out.println("Nome: " + nome);
		System.out.println("Cor do cabelo: " + corCabelo);
		System.out.println("Cor da Pele: " + corPele);
		System.out.println("Altura: " + altura);
		System.out.println("Idade: " + idade);
	}
	
}
