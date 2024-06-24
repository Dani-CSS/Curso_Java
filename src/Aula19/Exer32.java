package Aula19;

import java.util.Scanner;

public class Exer32 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número para ter a tabuada: ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println(" TABUADA DE " + vetorA[i]);
			
			for (int j=1; j<10; j++) {
				
				System.out.println(j + " X " + vetorA[i] + " = " + (vetorA[i]*j));
			}
			
			System.out.println();
		}
	}

}
