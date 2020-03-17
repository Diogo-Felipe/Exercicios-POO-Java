
package exerc03_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc03_Geometria {
    
    // TODO 1 dentro do pacote dimensao.bidimensional, crie uma classe chamada TrianguloEquilatero
    
    ///////////// FAÇA DENTRO DA CLASSE TrianguloEquilatero:
    ///////////// Agora, você vai decidir quais modificadores de acesso devem ser usados
    // TODO 2 declare o atributo lado
    // TODO 3 declare o atributo altura
    // TODO 4 crie um método para calcular e retornar a área do triângulo equilátero
    // TODO 5 crie um método para calcular e retornar o perímetro do triângulo equilátero
    // TODO 6 crie o contrutor padrão (sem argumentos)
    // TODO 7 crie o contrutor parametrizado (com todos os argumentos)
    // TODO 8 programe os métodos de configuração set e get para todos os atributos
    // TODO 9 dentro de cada método set, implemente a seguinte regra de validação:
    ///////// o atributo só será modificado se o valor passado para o set for maior que zero
    ///////// caso contrário, imprimir a mensagem "Valor inválido" e encerrar o programa
    //////////////////////////////////////////////
    
    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        tr1.setCateto1(14.5);
        tr1.setCateto2(48.1);
        tr1.setHipotenusa(51.2);
        tr1.setAlturaHipotenusa(12.3);
        
        double areaTr1 = tr1.calcArea();
        System.out.println("Área do triângulo tr1: " + areaTr1);
        
        double perimetroTr1 = tr1.calcPerimetro();
        System.out.println("Perímetro do triângulo tr1: " + perimetroTr1);

        TrianguloRetangulo tr2 = new TrianguloRetangulo(0.0,-1.2,3.0,9.9);
        
        // TODO 10 aqui dentro do main, crie um objeto da classe TrianguloEquilatero (nome: te1)
        
        // TODO 11 através do set, atribua valor 6.33 para o atributo lado
        // TODO 12 através do set, atribua valor 5.48 para o atributo altura
        
        // TODO 13 crie aqui uma variável double de nome areaTe1
        // TODO 14 através do objeto te1, acesse o método calcArea() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do método na variável areaTe1
        // TODO 15 imprima o valor da área da seguinte forma: "Área do triângulo te1: <VALOR>"
        
        // TODO 16 crie aqui uma variável double de nome perimetroTe1
        // TODO 17 através do objeto te1, acesse o método calcPerimetro() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do método na variável perimetroTe1
        // TODO 16 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo te1: <VALOR>"
    }
    
}
