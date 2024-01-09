package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ler = new Scanner(System.in);
		System.out.print("Qual o valor do seu salário por hora? ");
		float valorHora = Ler.nextFloat();
		System.out.print("Quantas horas você trabalha por mês? ");
		int horaMes = Ler.nextInt();
		double salario = valorHora*horaMes;
		System.out.println("O valor do seu salário em um mês de trabalho é R$" + salario);
		

	}

}
