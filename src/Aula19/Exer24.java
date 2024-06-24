package Aula19;

import java.util.Scanner;

public class Exer24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i]= scan.nextInt();			
		}
		
		boolean palindromo = true;
		for (int i=0; i<vetorA.length; i++) {
			
			if (vetorA[i] != vetorA[vetorA.length -1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = " );
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		System.out.println();
		
		if (palindromo) {
			System.out.println("Palíndromo");
		} else {
			System.out.println("Não é Palíndromo");
		}
						
	}


}
