
package dimensao.bidimensional;

public class TrianguloRetangulo {
    // DONE 1 altere os modificadores de acesso de todos os atributos para private
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double alturaHipotenusa;
    
    // TODO 15 altere o modificador de acesso deste método para public
    double calcArea(){
        double area = this.hipotenusa * alturaHipotenusa / 2.0;
        return area;
    }
    
    // TODO 21 altere o modificador de acesso deste método para public
    double calcPerimetro(){
        double perimetro = cateto1 + cateto2 + hipotenusa;
        return perimetro;
    }

    public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
        // TODO 25 chame o método set para realizar atribuição dos valores nos atributos
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
        this.alturaHipotenusa = alturaHipotenusa;
    }
    
    public TrianguloRetangulo() {
    }
    
    // TODO 2 crie aqui os métodos de configuração set e get de todos os atributos (dica: Alt+Insert)
    // TODO 3 dentro de cada método set, implemente a seguinte regra de validação:
    ///////// o atributo só será modificado se o valor passado para o set for maior que zero
    ///////// caso contrário, imprimir a mensagem "Valor inválido" e encerrar o programa

    
    
    
    
}
