package br.geometria.formas;

public class Retangulo implements ICalcGeometria{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		setBase(base);
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcArea() {
		return this.base*this.altura;
	}

	@Override
	public double calcPerimetro() {
		return (this.base*2) + (this.altura*2);
	}
	
}
