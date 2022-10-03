package Losango;

public class Calc_Losango {

	private double diagmaior;
	private double diagmenor;
	private double area;

	public Calc_Losango(double diagmaior, double diagmenor) {

		this.diagmenor = diagmenor;
		this.diagmaior = diagmaior;
		this.area = 0;

	}

	// definindo metodos SETTER
	public void setdiagMenor(double diagmenor) {
		this.diagmenor = diagmenor;
	}

	public void setdiagMaior(double diagmaior) {
		this.diagmaior = diagmaior;
	}

	public void setArea(double area){
	    this.area = area;
	}
	//definindo metodo de saida GETTER
	public double getdiagMenor() {
		return diagmenor;
	}
	public double getdiaMaior() {
		return diagmaior;
	}
	public double getArea() {
		return area;
	}
	public void calculaArea() {
		this.area = this.diagmaior * this.diagmenor / 2;
	}
}


