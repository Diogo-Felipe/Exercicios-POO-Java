package br.geometria.formas;

public class Retangulo implements ICalcGeometria{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		setBase(base);
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		if(base > 0) {
			this.base = base;
		} else {
			System.err.println("Valor negatvo");
			System.exit(0);
		}	
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		} else {
			System.err.println("Valor negatvo");
			System.exit(0);
		}
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
