package Aula19;

import java.util.Scanner;

public class Exer31 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[6];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++ ) {
			
			System.out.println("Entre com um número para a posição " + i);
			vetorA[i]= scan.nextInt();
		}
		
		int postB = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			
			if (vetorA[i] % 2 == 0) {
				vetorB[postB] = vetorA[i];
				postB++;
			}
		}
		
		for (int i1=0; i1<vetorA.length; i1++) {
				
			if (vetorA[i1] % 2 != 0) {
				vetorB[postB] = vetorA[i1];
				postB++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<postB; i++) {
			System.out.print(vetorA[i] + " ");			
		}		
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<postB; i++) {
			System.out.print(vetorB[i] + " ");		
		}	
		
			
	}
		
		
}
	
	
	
		
		
		
		
		
		
		
