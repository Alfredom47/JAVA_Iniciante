package Medida_Triangulo;

//definindo atributos
public class Medida_Triangulo {
	private double base;

	private double altura;
	private double area;

	public Medida_Triangulo(double base, double altura) {

		this.base = base;
		this.altura = altura;
		this.area = 0;
	}

	// definindo metodos de entrata SETTER
	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setArea(double area) {
		this.area = area;
	}

	// definindo metódo de saida GETTER
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getArea() {
		return area;
	}
	//definindo os metodos de calculo
	public void calculaArea() {
		this.area = this.base * this.altura/2;
	}

}
