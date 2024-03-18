package Aula17;

import java.util.Scanner;

public class Exer21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de turmas: ");
		int totTurmas = scan.nextInt();
		

		int totAlunosTurma = 0;
		double media = 0;
		int soma = 0;
		boolean invalido = true;
		
		for (int i=0; i<totTurmas; i++) {
			
			invalido = true;
			do { 				
				System.out.println("Informe o total de alunos da turma " + (i+1) + ": ");
				totAlunosTurma = scan.nextInt();
				if (totAlunosTurma <= 40) {
					invalido = false;
				} else {
					System.out.println("O total de alunos precisa ser menor que 40. Digite novamente: ");
				}
			} while (invalido);
								
			soma += totAlunosTurma;
			media = soma / totTurmas;
			
		
		}
		
		System.out.println("O número médio de alunos por turma é " + media);
	}
	
}
