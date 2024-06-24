package Aula19;

import java.util.Scanner;

public class Exer14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
				
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com a posição " + i);
			vetorA[i] = scan.nextInt();
						
		}
		
		int soma = 0;
		int impar = 0;
		for(int i=0; i<vetorA.length; i++) {
			if (vetorA[i] % 2 == 1) {
				soma += vetorA[i];
				impar++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("A soma dos números ímpares é " + soma);
		System.out.println("A média de números ímpares é " + (soma/impar));
			
	}

}
