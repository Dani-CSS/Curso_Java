package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em Farenheit: ");
		double temperaturaFare = Scan.nextDouble();
		double temperaturaCelsius = (5*(temperaturaFare -32)/9);
		System.out.println("A temperatura " + temperaturaFare + " em graus Ceusius é igual a " + temperaturaCelsius);

	}

}
