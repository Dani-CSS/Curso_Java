package curso_java_basico.aula1_a_11;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo: ");
		double tamArquivo = Scan.nextDouble();
		
		System.out.println("Informe qual a velocidade da internet: ");
		double velInternet = Scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("O tempo total de velocidade é: " + tempo);
				
	}

}
