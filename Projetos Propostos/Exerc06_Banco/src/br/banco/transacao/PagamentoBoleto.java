
package br.banco.transacao;

// DONE 01 - herde a classe Transacao

public class PagamentoBoleto extends Transacao{
    
    private String linhaDigitavel;
    private String dataVencimento;
    private String cedente;

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
    
    // DONE 02 - crie o método emitirComprovante (público, não recebe e nem retorna nada)
    //////////// este método deve imprimir os atributos desta classe, através do get
    public void emitirComprovante() {
    	super.emitirComprovante();
    	System.out.println("Linha digitavel: " + getLinhaDigitavel());
    	System.out.println("Data de Vencimento: " + getDataVencimento());
    	System.out.println("Cedente: " + getCedente());
    }
    
}
