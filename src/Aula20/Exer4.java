package Aula20;

import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso - ");
			System.out.println("Digite 2 para verificar compromisso - ");
			System.out.println("Digite 3 para sair: ");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) {
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();	
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente: ");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while (!diaValido) {
					System.out.println("Entre com a hora do compromisso: ");
				hora = scan.nextInt();	
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora inválida. Digite novamente: ");
					}
				}
				
				
				dia --;
				System.out.println("Digite o compromissos: ");
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();	
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente: ");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while (!diaValido) {
					System.out.println("Entre com a hora do compromisso: ");
				hora = scan.nextInt();	
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora inválida. Digite novamente: ");
					}
				}
				
				dia --;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 3) {
				sair = true;
			} else {
				System.out.println("Opção inválida. Digite novamente: ");
			}
			
		}
		
	}

}
