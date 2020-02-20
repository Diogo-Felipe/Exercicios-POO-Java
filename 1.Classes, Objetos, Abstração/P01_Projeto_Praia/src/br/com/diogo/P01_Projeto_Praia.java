package br.com.diogo;

public class P01_Projeto_Praia {

	public static void main(String[] args) {
		
		Crianca c1; //Variável!
		c1 = new Crianca(); //Objeto!
		
		c1.imprimirAtributos();
		
		//Criando outro objeto
		Crianca c2 = new Crianca();
		
		c2.nome = "Vintinho";
		c2.corCabelo = "Preto";
		c2.corPele = "Pardo";
		c2.altura = 1.30;
		c2.idade = 12;
		
		c2.imprimirAtributos();
		
		GuardaSol gs1 = new GuardaSol();
		gs1.abrir();
		gs1.fechar();
	}

}
