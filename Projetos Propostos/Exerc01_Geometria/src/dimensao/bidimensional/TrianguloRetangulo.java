package dimensao.bidimensional;

public class TrianguloRetangulo {
	
	double cateto1, cateto2, hipotenusa, alturaHipotenusa;
	
	public TrianguloRetangulo () {
		System.out.println("Criando Triangulo Retangulo Sem Valores");
	}
	
	public TrianguloRetangulo (double cateto1, double cateto2, double hipotenusa, double alturaHipotenusa) {
		System.out.println("Criando Triangulo Retangulo Com Valores");
		
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
		this.hipotenusa = hipotenusa;
		this.alturaHipotenusa = alturaHipotenusa;
	}
	
	public double calculaArea() {
		return (this.hipotenusa * this.alturaHipotenusa) / 2.0;
	}
	
	public double calculaPerimetro() {
		return this.cateto1 + this.cateto2 + hipotenusa;
	}
}
