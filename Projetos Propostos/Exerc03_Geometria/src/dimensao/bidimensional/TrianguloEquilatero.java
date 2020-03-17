package dimensao.bidimensional;

public class TrianguloEquilatero {
	private double lado;
	private double altura;
	
	TrianguloEquilatero(){
		System.out.println("Inicializando construtor sem parametros");
	}
	
	TrianguloEquilatero( double lado, double altura ){
		this.setLado(lado);
		this.setAltura(altura);
	}
	
	public double calculaArea() {
		return lado * altura;
	}
	
	public double calculaPerimetro() {
		return lado * 3;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado( double lado ) {
        if(lado > 0) {
            this.lado = lado;
        } else {
            System.err.println("Erro! Valor inválido de hipotenusa!");
            System.exit(0); //encerrando a execução do programa
        }
	}
	
	public double getAltura() {
		return this.lado;
	}
	
	public void setAltura( double altura ) {
        if(lado > 0) {
            this.altura = altura;
        } else {
            System.err.println("Erro! Valor inválido de hipotenusa!");
            System.exit(0); //encerrando a execução do programa
        }
	}
}
