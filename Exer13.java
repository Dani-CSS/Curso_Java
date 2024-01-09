package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ler = new Scanner(System.in);
		System.out.print("Qual o valor do seu salário por hora? ");
		float valorHora = Ler.nextFloat();
		System.out.print("Quantas horas você trabalha por mês? ");
		int horaMes = Ler.nextInt();
		double salario = valorHora*horaMes;
		System.out.println("------------------------------------------------------------");
		System.out.println("O valor do seu salário bruto é R$" + salario);
		double IR = (salario/100)*11;
		System.out.println("O valor que você pagou de IR foi: R$" + IR);
		double INSS = (salario/100)*8;
		System.out.println("O valor que você pagou ao INSS foi: R$" + INSS);
		double sindicato = (salario/100)*5;
		System.out.println("O valor pago ao sindicato foi: R$" + sindicato);
		double salLiquido = salario - IR-INSS-sindicato;
		System.out.println("O valor liquido do seu salário é: R$" + salLiquido);
		System.out.println("------------------------------------------------------------");
	
	}
}
