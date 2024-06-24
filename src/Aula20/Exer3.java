package Aula20;

import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] matrizA = new int[3][3];
		
		for(int i=0; i<matrizA.length;i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				System.out.println("Entre com a posição [" + i + ", " + j + "]");
				matrizA[i][j] = scan.nextInt();
			}
			
		}
		
		int qtdPares = 0;
		int qtdImpares = 0;
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				if(matrizA[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
			
		}
		
		System.out.println("MATRIZ A: ");
		for(int i=0; i<matrizA.length; i++) {
			for(int j=0; j<matrizA[i].length; j++) {
				
				System.out.print(matrizA[i][j] + " ");
			}
			
			System.out.println();			
		}
		
		System.out.println("Pares: " +qtdPares);
		System.out.println("Impares: " +qtdImpares);
		
	}

}
