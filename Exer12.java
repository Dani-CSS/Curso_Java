package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Ler = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		double altura = Ler.nextDouble();
		double IMC = (72.7*altura) - 58;
		System.out.println("Seu peso ideal, considerando sua estatura de " + altura + " é " + IMC + "kg");

	}

}
