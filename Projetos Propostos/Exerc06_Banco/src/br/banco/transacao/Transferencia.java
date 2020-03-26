package br.banco.transacao;

// DONE 03 - herde a classe Transacao

public class Transferencia extends Transacao{

    private String contaOrigem;
    private String contaDestino;

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
    
    // DONE 04 - crie o método emitirComprovante (público, não recebe e nem retorna nada)
    //////////// este método deve imprimir os atributos desta classe, através do get
    public void emitirComprovante() {
    	super.emitirComprovante();
    	System.out.println("Conta origem: " + getContaOrigem());
    	System.out.println("Conta destino: " + getContaDestino());
    }
    
    
}
