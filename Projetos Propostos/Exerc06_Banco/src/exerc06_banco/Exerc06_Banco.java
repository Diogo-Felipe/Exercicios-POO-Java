
package exerc06_banco;

import br.banco.transacao.PagamentoBoleto;
import br.banco.transacao.Transferencia;

public class Exerc06_Banco {

    public static void main(String[] args) {
        // DONE 05 - crie um objeto da classe PagamentoBoleto chamado boleto1
    	PagamentoBoleto boleto1 = new PagamentoBoleto();
    	
        // DONE 06 - através do objeto boleto1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
    	boleto1.setDescricao("Pagamento de Conta");
    	boleto1.setValor(200);
    	boleto1.setData("03/02/2020");
    	boleto1.setDataVencimento("08/05/2020");
    	boleto1.setLinhaDigitavel("131213154263");
    	boleto1.setCedente("Conta do Diogo");
        
        // DONE 07 - crie um objeto da classe Transferencia chamado transf1
    	Transferencia transf1 = new Transferencia();
        // DONE 08 - através do objeto transf1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
    	transf1.setDescricao("Pagamento de Conta");
    	transf1.setValor(200);
    	transf1.setData("03/02/2020");
    	transf1.setContaOrigem("Conta do Diogo");
    	transf1.setContaDestino("Conta da Unama");
    	
        // DONE 09 - chame a método emitirComprovante através do objeto boleto1
        // DONE 10 - chame a método emitirComprovante através do objeto transf1
    	boleto1.emitirComprovante();
    	transf1.emitirComprovante();
        
        // DONE 11 - execute o projeto!
        
        // DONE 12 - comente: os atributos da superclasse (Transferencia) são impressos? Justifique.
        //////////// R: Sobreescrevemos o metodo
        
        // DONE 13 - comente: o que pode ser feito para resolver este problema?
        //////////// R: Chamando o metodo sobrescrito da super clase
        
        // DONE 14 - preste atenção para solucionar o problema! Depois, faça.
        
    }
    
}
