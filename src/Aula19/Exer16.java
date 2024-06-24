package Aula19;

import java.util.Scanner;

public class Exer16 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[3];
				
		for(int i=0; i<vetorA.length; i++) {			
			System.out.println("Entre com a posição " + i);
			vetorA[i] = scan.nextInt();						
		}
		
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] == 15) {
				igual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15++;
			} else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			} 
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Igual a 15:  " + igual15);
		System.out.println("Menor que 15:  " + somaMenor15);
		System.out.println("Média de números maior que 15: " + (somaMaior15 / qtdMaior15));
	}

}
