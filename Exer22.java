package Aula17;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CD's: ");
		int totCDs = scan.nextInt();
		
		double valorTotal;
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<totCDs; i++) {
			System.out.println("Informe qual foi o valor do CD " + (i+1) + ": ");
			valorTotal = scan.nextDouble();
			
			soma += valorTotal;
		}
		
		
		media = soma / totCDs;
		
		System.out.println("O valor total investido em CD's foi de R$ " + soma);
		System.out.println("O valor médio investido em cada CD foi de R$  " + media);
		
	}

}
