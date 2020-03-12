package dimensao.bidimensional;

class TrianguloRetangulo {
	
	double cateto1, cateto2, hipotenusa, alturaHipotenusa;
	
	public double calculaArea() {
		return (cateto1 * cateto2) / 2.0;
	}
	
	public double calculaPerimetro() {
		return cateto1 + cateto2 + hipotenusa;
	}
}
