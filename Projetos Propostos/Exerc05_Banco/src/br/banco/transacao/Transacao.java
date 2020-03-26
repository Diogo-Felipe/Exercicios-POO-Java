package br.banco.transacao;

// TODO 01 - esta classe é uma gambiarra! ela representa duas coisas do negócio
//////////// vamos tentar separar as informações em duas classes

// TODO 02 - crie a classe Transferencia dentro de br.banco.transacao
//////////// FAÇA DENTRO DA CLASSE Transferencia:
// TODO 03 - declare os atributos contaOrigem e contaDestino (ambos privados e String)
// TODO 04 - crie os métodos de configuração set e get desses dois atributos
////////////

// TODO 05 - crie a classe PagamentoBoleto dentro de br.banco.transacao
//////////// FAÇA DENTRO DA CLASSE PagamentoBoleto:
// TODO 06 - declare os atributos linhaDigitavel, dataVencimento, cedente (todos privados e String)
// TODO 07 - crie os métodos de configuração set e get desses três atributos
////////////
 
public class Transacao {

    // atributos comuns
    private String descricao;
    private double valor;
    private String data;

    // TODO 08 - apague os atributos contaOrigem e contaDestino
    // atributos de uma transferência
    private String contaOrigem;
    private String contaDestino;

    // TODO 09 - apague os atributos linhaDigitavel, dataVencimento, cedente
    // atributos de um pagamento de boleto
    private String linhaDigitavel;
    private String dataVencimento;
    private String cedente;
    
    
    
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

    
    // TODO 10 - elime os métodos get e set dos atributos que não existem mais na classe
    
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
    
    
    public void emitirComprovante() {
        
        // TODO 11 - imprima aqui neste método somente os atributos que existem na classe Transacao
        
        System.out.println("Comprovante da transação");
        System.out.println("========================");
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data: " + this.getData());
        System.out.println("Valor: " + this.getValor());
        if (this.getContaOrigem() != null) {
            System.out.println("Conta de origem: "
                    + this.getContaOrigem());
            System.out.println("Conta de destino: "
                    + this.getContaDestino());
        } else {
            System.out.println("Linha digitável: "
                    + this.getLinhaDigitavel());
            System.out.println("Data de vencimento: "
                    + this.getDataVencimento());

            System.out.println("Cedente: " + this.getCedente());
        }
        System.out.println();
    }

}
