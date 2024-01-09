package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class AreaQuadrado {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o lado de um quadrado: ");
		double lado = ler.nextDouble();
		double quadrado = Math.pow(lado, 2);
		double dobroQuadrado =  quadrado*2;
		System.out.println("A área total de um quadrado, cujo lado é " + lado + " é " + quadrado + ". E o dobro desse quadrado é " + dobroQuadrado);
		
	}

}
