package br.banco.transacao;

public class Transferencia {
	////////////FAÇA DENTRO DA CLASSE Transferencia:
	//DONE 03 - declare os atributos contaOrigem e contaDestino (ambos privados e String)
	private String contaOrigem;
	private String contaDestino;
	
	//DONE 04 - crie os métodos de configuração set e get desses dois atributos
	public String getContaOrigem() {
		return contaOrigem;
	}
	
	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	
	public String getContaDestino() {
		return contaDestino;
	}
	
	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}
	
	////////////
}
