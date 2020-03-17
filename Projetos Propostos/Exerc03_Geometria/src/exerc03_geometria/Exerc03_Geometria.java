
package exerc03_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc03_Geometria {
    
    // DONE 1 dentro do pacote dimensao.bidimensional, crie uma classe chamada TrianguloEquilatero
    
    ///////////// FAÃ‡A DENTRO DA CLASSE TrianguloEquilatero:
    ///////////// Agora, vocÃª vai decidir quais modificadores de acesso devem ser usados
    // DONE 2 declare o atributo lado
    // DONE 3 declare o atributo altura
    // TODO 4 crie um mÃ©todo para calcular e retornar a Ã¡rea do triÃ¢ngulo equilÃ¡tero
    // TODO 5 crie um mÃ©todo para calcular e retornar o perÃ­metro do triÃ¢ngulo equilÃ¡tero
    // TODO 6 crie o contrutor padrÃ£o (sem argumentos)
    // TODO 7 crie o contrutor parametrizado (com todos os argumentos)
    // TODO 8 programe os mÃ©todos de configuraÃ§Ã£o set e get para todos os atributos
    // TODO 9 dentro de cada mÃ©todo set, implemente a seguinte regra de validaÃ§Ã£o:
    ///////// o atributo sÃ³ serÃ¡ modificado se o valor passado para o set for maior que zero
    ///////// caso contrÃ¡rio, imprimir a mensagem "Valor invÃ¡lido" e encerrar o programa
    //////////////////////////////////////////////
    
    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        tr1.setCateto1(14.5);
        tr1.setCateto2(48.1);
        tr1.setHipotenusa(51.2);
        tr1.setAlturaHipotenusa(12.3);
        
        double areaTr1 = tr1.calcArea();
        System.out.println("Ã�rea do triÃ¢ngulo tr1: " + areaTr1);
        
        double perimetroTr1 = tr1.calcPerimetro();
        System.out.println("PerÃ­metro do triÃ¢ngulo tr1: " + perimetroTr1);

        TrianguloRetangulo tr2 = new TrianguloRetangulo(0.0,-1.2,3.0,9.9);
        
        // TODO 10 aqui dentro do main, crie um objeto da classe TrianguloEquilatero (nome: te1)
        
        // TODO 11 atravÃ©s do set, atribua valor 6.33 para o atributo lado
        // TODO 12 atravÃ©s do set, atribua valor 5.48 para o atributo altura
        
        // TODO 13 crie aqui uma variÃ¡vel double de nome areaTe1
        // TODO 14 atravÃ©s do objeto te1, acesse o mÃ©todo calcArea() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do mÃ©todo na variÃ¡vel areaTe1
        // TODO 15 imprima o valor da Ã¡rea da seguinte forma: "Ã�rea do triÃ¢ngulo te1: <VALOR>"
        
        // TODO 16 crie aqui uma variÃ¡vel double de nome perimetroTe1
        // TODO 17 atravÃ©s do objeto te1, acesse o mÃ©todo calcPerimetro() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do mÃ©todo na variÃ¡vel perimetroTe1
        // TODO 16 imprima o valor do perÃ­metro da seguinte forma: "PerÃ­metro do triÃ¢ngulo te1: <VALOR>"
    }
    
}
