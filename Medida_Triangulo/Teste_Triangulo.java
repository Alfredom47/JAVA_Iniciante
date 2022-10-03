package Medida_Triangulo;

import java.util.Scanner;

public class Teste_Triangulo {

	public static void main(String[] args) {
		Medida_Triangulo abc = new Medida_Triangulo (10,2);
		//abc.calculaArea();
		//System.out.println("A area do triangulo é: " +abc.getArea());
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base do triangulo: ");
		abc.setBase(entrada.nextDouble());
		System.out.println("Digite a altura do triangulo: ");
		abc.setAltura(entrada.nextDouble());
		abc.calculaArea();
		System.out.println("A area do triangulo é: " +abc.getArea());

	}

}
