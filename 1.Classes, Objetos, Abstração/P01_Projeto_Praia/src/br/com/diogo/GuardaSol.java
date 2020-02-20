package br.com.diogo;

public class GuardaSol {
	String cor;
	double altura;
	double raio;
	boolean fechado = true;
	
	void abrir() {
		if(fechado) {
			System.out.println("Abrindo guarda-sol");
		} 		
	}
	
	void fechar() {
		if(!fechado) {
			System.out.println("Fechando guarda-sol");
		}
	}
}
