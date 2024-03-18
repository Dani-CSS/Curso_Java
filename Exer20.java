package Aula17;

import java.util.Scanner;

public class Exer20 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		
		int numPessoas = scan.nextInt();
		
		int soma = 0;
		int media = 0;		
		
		
		for (int i=0; i<numPessoas; i++) {
			System.out.println("Informe a sua idade da pessoa " + (i+1));
			int idade = scan.nextInt();	
			soma += idade;			
		}
		
		media = soma / numPessoas;
		
		System.out.println("A média de idade da turma é " + media);
		
		if (media > 0 && media <= 25) {
			System.out.println("Turma de jovens!");
		} else if ( media > 25 && media <=60) {
			System.out.println("Turma de adultos!");
		} else if (media > 60) {
			System.out.println("Turma de idosos!");
		}
		
		
		
		
	}

}
