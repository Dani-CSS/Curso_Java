package Aula19;

import java.util.Scanner;

public class Exer35 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		
		boolean divisor = true;
		
		for (int i=0; i<vetorA.length; i++) {			
			System.out.println("Entre com a posição " + i);
			vetorA[i] = scan.nextInt();		
		}
			
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Analizando o número " + vetorA[i]);
			
			for (int j=2; j<=vetorA[i]; j++) {
				
				if (vetorA[i] % j == 0) {
					System.out.println(j + " é divisor");
				} 	
			
		}

			System.out.println();
			
		}
		
			
	}
	
	

}
