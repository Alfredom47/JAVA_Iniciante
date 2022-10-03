package Losango;

import java.util.Scanner;

public class Teste_Losango {

	public static void main(String[] args) {
	Calc_Losango abc = new Calc_Losango(1,2);
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite a diagonal maior: ");
	abc.setdiagMaior(entrada.nextDouble());
	System.out.println("Digite a diagonal menor: ");
	abc.setdiagMenor(entrada.nextDouble());
	abc.calculaArea();
	System.out.println(" Area total do losango é: "+abc.getArea());

	}

}
