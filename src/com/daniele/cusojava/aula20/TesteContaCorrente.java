package com.daniele.cusojava.aula20;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "19581";
		conta.agencia = "1432";
		conta.saldo = 87.546;
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		
		boolean saqueEfetuado = conta.saque(10);
		
		
		if (saqueEfetuado){
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado = conta.saque(500);
		System.out.println("Tentativa de saque de R$ 500,00");
		if (saqueEfetuado){
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Depósito de R$ 500,00");
		conta.depositar(500);
			conta.consultarSaldo();		
		
			
		if (conta.verificarUsoChequeEspecial())	{
			System.out.println("Está usando o cheque especial");
		} else {
			System.out.println("Não está usando cheque especial.");
		}
	}

}
