package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class ConversaoMedidas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a medida em metros: ");
		double num = ler.nextDouble();
		double conversor = num*100;
		System.out.println("O número digitado em metros corresponde a " + conversor + " centímetros.");
	}

}
