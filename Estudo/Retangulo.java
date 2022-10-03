package Estudo;

public class Retangulo {

	private double largura;
	private double comprimento;
	private double perimetro;
	private double area;

	public Retangulo(double largura, double comprimento) {

		this.largura = largura;
		this.comprimento = comprimento;
		this.perimetro = 0;
		this.area = 0;

	}
	// definindo os metodos de entrada

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public void setArea(double area) {
		this.area = area;
	}
	// Definindo metodos de saida

	public double getLargura() {
		return this.largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}
	//definindo os metodos de calculo
	public void calculaPerimetro() {
		this.perimetro = 2* this.largura + 2 * this.comprimento;
	}
	public void calculaArea() {
		this.area = this.largura * this.comprimento;
	}

}
