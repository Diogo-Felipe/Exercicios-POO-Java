package br.banco.transacao;
 
public class Transacao {

    private String descricao;
    private double valor;
    private String data;    
    
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

    
    public void emitirComprovante() {
        System.out.println("Comprovante da transação");
        System.out.println("========================");
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor: " + this.getValor());
    }

}
