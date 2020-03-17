package dimensao.bidimensional;

public class TrianguloEquilatero {
	private double lado;
	private double altura;
	
	TrianguloEquilatero(){
		System.out.println("Inicializando construtor sem parametros");
	}
	
	TrianguloEquilatero( double lado, double altura ){
		this.lado = lado;
		this.altura = altura;
	}
	
	public double calculaArea() {
		return lado * altura;
	}
	
	public double calculaPerimetro() {
		return lado * 3;
	}
}
