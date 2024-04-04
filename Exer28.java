package Aula17;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int num = scan.nextInt();	
		
		boolean primo = true;
		
		for (int i=2; i<num; i++) {
			if (num % i == 0) {
				System.out.println("O número informado não é um número primo! - é divisível por " + i);
				primo = false;
			} 
			
		}
		
		if (primo) {
			System.out.println("É número primo!");
		}
		
		
	}

}
