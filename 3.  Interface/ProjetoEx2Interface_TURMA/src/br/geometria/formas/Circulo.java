package br.geometria.formas;
import java.math.*;

public class Circulo implements ICalcGeometria{
	private double raio;
	
	public Circulo(double raio) {
		setRaio(raio);
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcArea() {
		return Math.PI * (raio*raio);
	}

	@Override
	public double calcPerimetro() {
		return 2 * Math.PI * raio;
	}
	
	
}
