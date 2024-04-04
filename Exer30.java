package Aula17;

import java.util.Scanner;

public class Exer30 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Montar a taboada de: ");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int primeiroNum, ultimoNum;
		
		do {
			
			System.out.println("Começar pelo número: ");
			primeiroNum = scan.nextInt();
			
			System.out.println("Terminar em: ");
			ultimoNum = scan.nextInt();
			
			if (ultimoNum > primeiroNum) {
				
				invalido = false;
			}
			
		} while (invalido);
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começar por " + primeiroNum);
		System.out.println("Terminar em " + ultimoNum );
		
		for (int i=primeiroNum; i<=ultimoNum; i++ ) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
					
	}
	
	
		
}
