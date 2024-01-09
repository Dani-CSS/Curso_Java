package curso_java_basico.aula1_a_11;

import java.util.Scanner; 

public class Primeiros_comando {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a nota do primeiro bimestre: ");
		int num1 = ler.nextInt();
		System.out.println("Informe a nota do segundo bimestre: ");
		int num2 = ler.nextInt();
		System.out.println("Informe a nota do terceito bimestre: ");
		int num3 = ler.nextInt();
		System.out.println("Informe a nota do quarto bimestre: ");
		int num4 = ler.nextInt();
		int mediaNotas = (num1 + num2 + num3 + num4) / 4;
		System.out.println("Sua média dos bimestres é  " + mediaNotas);
		
					
    }		
		
}
