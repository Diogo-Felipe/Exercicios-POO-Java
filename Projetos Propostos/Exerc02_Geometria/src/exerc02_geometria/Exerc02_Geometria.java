
package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        // DONE 4 apague as linhas de acesso direto aos atributos
        ///////// sabemos que este tipo de acesso Ã© prejudical para o projeto, porque diminui a segurança(complete)
        
        // DONE 5 atravÃ©s do set, atribua valor 14.5 para o atributo cateto1
        // DONE 6 atravÃ©s do set, atribua valor 48.1 para o atributo cateto2
        // DONE 7 atravÃ©s do set, atribua valor 51.2 para o atributo hipotenusa
        // DONE 8 atravÃ©s do set, atribua valor 12.3 para o atributo alturaHipotenusa
        
        tr1.setCeteto1(14.5);
        tr1.setCeteto2(48.1);
        tr1.setHipotenusa(51.2);
        tr1.setAlturaHipotenusa(12.3);
        
        // DONE 9 comente: as atribuiÃ§Ãµes deram certo? Por quÃª?
        // Deram, já que estavam publicos
        
        // TODO 10 crie aqui uma variÃ¡vel double de nome areaTr1        
        // TODO 11 atravÃ©s do objeto tr1, acesse o mÃ©todo calcArea() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do mÃ©todo na variÃ¡vel areaTr1
        // TODO 12 imprima o valor da Ã¡rea da seguinte forma: "Ã�rea do triÃ¢ngulo tr1: <VALOR>"
        double areaTr1 = tr1.calcArea();
        System.out.println("Área do Triângulo: " + areaTr1);
        
        // TODO 13 comente: por que estÃ¡ dando erro?
        // Esta dando erro pois o método é default
        // TODO 14 comente: o que pode ser feito para resolver este erro?
        // Tornar o método público
        
        // TODO 16 crie aqui uma variÃ¡vel double de nome perimetroTr1
        // TODO 17 atravÃ©s do objeto tr1, acesse o mÃ©todo calcPerimetro() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do mÃ©todo na variÃ¡vel perimetroTr1
        // TODO 18 imprima o valor do perÃ­metro da seguinte forma: "PerÃ­metro do triÃ¢ngulo tr1: <VALOR>"
        // TODO 19 comente: por que estÃ¡ dando erro?
        // TODO 20 comente: o que pode ser feito para resolver este erro?
        
        // TODO 21 crie um outro objeto atravÃ©s do construtor, passando um valor invÃ¡lido
        // TODO 22 atravÃ©s do objeto da tarefa anterior, chame os mÃ©todos calcArea() e calcPerimetro()
        // TODO 23 imprima os valores dos cÃ¡lculos
        
        // TODO 24 comente: o que acontece? o que fazer para consertar este problema?
        
        
    }
    
}
