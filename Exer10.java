package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int num1 = Scan.nextInt();
		System.out.print("Informe outro número inteiro: ");
		int num2 = Scan.nextInt();
		System.out.print("Informe um número real: ");
		double num3 = Scan.nextDouble();
		int produto = (num1*2)*(num2/2);
		double triplo = (num1*3)+num3;
		double cubo = Math.pow(num3, 3);
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro é " + triplo);
		System.out.println("O valor de " + num3 + " ao cubo é " + cubo);
		

	}

}
