package br.geometria.formas;

public class Quadrado implements ICalcGeometria{
	private double lado;
	
	public Quadrado(double lado){
		this.setLado(lado);
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		return this.lado*this.lado;
	}

	@Override
	public double calcPerimetro() {
		return this.lado*4;
	}

}
