package br.geometria.formas;

public class ProjetoEx2 {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(4.0);
		Retangulo r1 = new Retangulo(2.0, 4.0);
		Circulo c1 = new Circulo(3.0);
		
		System.out.println("Area quadrado: " + q1.calcArea());
		System.out.println("Area retangulo: " + r1.calcArea());
		System.out.println("Area circulo: " + c1.calcArea());
		System.out.println("Perimetro quadrado: " + q1.calcPerimetro());
		System.out.println("Perimetro retangulo: " + r1.calcPerimetro());
		System.out.println("Perimetro circulo: "+ c1.calcPerimetro());
	}

}
