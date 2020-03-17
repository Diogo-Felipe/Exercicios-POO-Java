package dimensao.bidimensional;

public class TrianguloEquilatero {
	private double lado;
	private double altura;
	
	public double calculaArea() {
		return lado * altura;
	}
	
	public double calculaPerimetro() {
		return lado * 3;
	}
}
