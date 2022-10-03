package Cone;

import java.util.Scanner;

public class Testa_Cone {

	public static void main(String[] args) {
		Calcula_Cone cde = new Calcula_Cone(1,2);
		Scanner entrada  = new Scanner (System.in);
		System.out.println("Digite o diametro do Cone: ");
		cde.setDiametro(entrada.nextDouble());
		System.out.println("Digite o altura do Cone: ");
		cde.setAltura(entrada.nextDouble());
		cde.calculaRaio();
		cde.calculaVolume();
		cde.calculaAreabase();
		System.out.println("O Raio do Cone é: "+cde.getRaio());
		System.out.println("O Volume do Cone é: "+cde.getVolume());
		System.out.println("A Area Base do Cone é: "+cde.getAreabase());
		

	}

}
