package aula26;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é " + autonomia);
		System.out.println("A autonimia do carro é " + van.obterAutonomia());
		
		
		double qtdCombusstivel10 = van.calcularCombustivel(10);
		double qtdCombusstivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombusstivel10 = " + qtdCombusstivel10);
		System.out.println("qtdCombusstivel15 = " + qtdCombusstivel15);
	}

}
