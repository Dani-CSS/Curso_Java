package curso_java_basico.aula1_a_11;

import java.util.*;
import java.math.*;

public class CalculoRaio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do círculo: ");
		double raio = scan.nextDouble();
		double area = Math.PI*raio*raio;
		System.out.println("A área desse círculo com raio " + raio + " é " + area);
		//faltou definir somente 2 casa decimais depois da vírgula para o resultado

	}

}
