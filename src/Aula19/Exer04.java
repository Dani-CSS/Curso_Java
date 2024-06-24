package Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		double[] vetorB = new double[5];
		
		for (int i=0; i<vetorA.length; i++) {
			
			System.out.println("Entre com a posição " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("##,##.##");
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}
		
		

	}

}
