package br.banco.transacao;

// DONE 01 - esta classe é uma gambiarra! ela representa duas coisas do negócio
//////////// vamos tentar separar as informações em duas classes

// DONE 02 - crie a classe Transferencia dentro de br.banco.transacao


// DONE 05 - crie a classe PagamentoBoleto dentro de br.banco.transacao



 
public class Transacao {

    // atributos comuns
    private String descricao;
    private double valor;
    private String data;

    // DONE 08 - apague os atributos contaOrigem e contaDestino
    // atributos de uma transferência

    // DONE 09 - apague os atributos linhaDigitavel, dataVencimento, cedente
    // atributos de um pagamento de boleto
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    // DONE 10 - elime os métodos get e set dos atributos que não existem mais na classe
    
    
    
    public void emitirComprovante() {
        
        // DONE 11 - imprima aqui neste método somente os atributos que existem na classe Transacao
        
        System.out.println("Comprovante da transação");
        System.out.println("========================");
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor: " + this.getValor());
        System.out.println();
    }

}
