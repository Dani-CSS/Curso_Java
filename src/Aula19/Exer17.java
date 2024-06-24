package Aula19;

import java.util.Scanner;

public class Exer17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		
		for (int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		int maior35 = 0;		
		for (int i=0; i<idades.length; i++) {
			if (idades[i]> 35) {
				maior35++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + ", ");
		}
		System.out.println();
				
		System.out.println("A quantidade de pessoas com idade superior a 35 é " + maior35);
		
	}

}
