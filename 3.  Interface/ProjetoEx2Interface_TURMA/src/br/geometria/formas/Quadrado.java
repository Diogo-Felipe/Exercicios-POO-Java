package br.geometria.formas;

public class Quadrado implements ICalcGeometria{
	private double lado;
	
	public Quadrado(double lado){
		this.setLado(lado);
	}
	
	public void setLado(double lado){
		if(lado > 0) {
			this.lado = lado;
		} else {
			System.err.println("Valor negatvo");
			System.exit(0);
		}
	}
	
	public double getLado() {
		return lado;
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
