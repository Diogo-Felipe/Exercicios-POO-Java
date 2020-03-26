package br.banco.transacao;

public class PagamentoBoleto {
	////////////FAÇA DENTRO DA CLASSE PagamentoBoleto:
	//DONE 06 - declare os atributos linhaDigitavel, dataVencimento, cedente (todos privados e String)
	private String linhaDigitavel;
	private String dataVencimento;
	private String cedente;
	
	//DONE 07 - crie os métodos de configuração set e get desses três atributos
	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}
	
	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public String getCedente() {
		return cedente;
	}
	
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	
	////////////
}
