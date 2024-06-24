package com.daniele.cusojava.aula27;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno =  new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso: ");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula: ");
		aluno.matricula = scan.nextInt();
		
		//aluno.nomesdisciplinas = new String[3];		
		for (int i=0; i<aluno.nomesdisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i + 1));
			aluno.nomesdisciplinas[i] = scan.next();
		}
		
		for (int i=0; i<aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.nomesdisciplinas[i]);
			
			for (int j=0; j<aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.notasDisciplinas[i][j]= scan.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
		for (int i=0; i<aluno.nomesdisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomesdisciplinas[i] +" foi aprovado!");
			} else {
				System.out.println("Disciplina " + aluno.nomesdisciplinas[i]  + " foi reprovado!");
			}
			
		}

	}

}
