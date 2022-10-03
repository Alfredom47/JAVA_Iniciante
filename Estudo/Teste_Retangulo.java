package Estudo;

import java.util.Scanner;

public class Teste_Retangulo {

	public static void main(String[] args) {
		Retangulo xyz = new Retangulo (5,10);
		xyz.calculaPerimetro();
		xyz.calculaArea();
		System.out.println("Operimetro é: " +xyz.getPerimetro());
		System.out.println("A area é: " +xyz.getArea());
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da largura: ");
		xyz.setLargura(entrada.nextDouble());
		System.out.println("Digite o valor do comprimento: ");
		xyz.setComprimento(entrada.nextDouble());
		xyz.calculaPerimetro();
		xyz.calculaArea();
		System.out.println("Operimetro é: " +xyz.getPerimetro());
		System.out.println("A area é: " +xyz.getArea());
		

	}

}
