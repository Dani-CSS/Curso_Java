package Aula17;

import java.util.Scanner;

public class Exer32 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do {
			
			System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
			cod = scan.nextInt();
			qtd =  scan.nextInt();
			
			if (cod == 0) {
				
				naoTerminar = false;
				output += "---------RESUMO DO PEDIDO-------------" + "\n" + "Total a pagar R$ = " + total;
				
			} else {
				
				if (cod == 100) {
					output += "Cachorro Quente -> 1,20 X " + qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				} else if (cod == 101) {
					output += "Bauru Simples -> 1,30 X " + qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				} else if (cod == 102) {
					output += "Bauru com Ovo -> 1,50 X " + qtd;
					output += " = " + (1.5*qtd) + "\n";
					total += 1.5*qtd;
				} else if (cod == 103) {
					output += "Hamburguer -> 1,20 X " + qtd;
					output += " = " + (1.2*qtd) + "\n";
					total += 1.2*qtd;
				} else if (cod == 104) {
					output += "Chesse Burguer -> 1,30 X " + qtd;
					output += " = " + (1.3*qtd) + "\n";
					total += 1.3*qtd;
				} else if (cod == 105) {
					output += "Refrigerante -> 1,00 X " + qtd;
					output += " = " + (1*qtd) + "\n";
					total += 1.3*qtd;
				}
			}
			
		}while(naoTerminar);
		
		System.out.println(output);
	}

}
