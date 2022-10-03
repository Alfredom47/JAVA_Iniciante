package Cone;

public class Calcula_Cone {

	private double altura;
	private double areabase;
	private double raio;
	private double diametro;
	private double volume;

	public Calcula_Cone(double altura, double diametro) {

		this.altura = altura;
		this.areabase = 0;
		this.raio = 0;
		this.diametro = diametro;
		this.volume = 0;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setAreabase(double areabase) {
		this.areabase = areabase;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getAltura() {
		return altura;
	}

	public double getAreabase() {
		return areabase;
	}

	public double getRaio() {
		return raio;
	}

	public double getDiametro() {
		return diametro;
	}

	public double getVolume() {
		return volume;
	}

	public void calculaRaio() {
		this.raio = diametro / 2;
	}

	public void calculaAreabase() {
		this.areabase = Math.PI * Math.pow(raio, 2) * this.altura / 3;
	}

	public void calculaVolume() {
		this.volume = this.areabase * this.altura / 3;
	}

}
