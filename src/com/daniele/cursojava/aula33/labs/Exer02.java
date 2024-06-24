package com.daniele.cursojava.aula33.labs;

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrete conta = new ContaCorrete();
		
		conta.setAgencia("1627");
		conta.setNumero("010007996");
		conta.setEspecial(true);
		conta.setSaldo(-10);
		conta.setLimite(500);
		conta.setLimiteEspecial(500);		
		
		System.out.println("O Saldo da conta " + conta.getNumero() + " é: R$ " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.saque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
		}
		
		System.out.println("Depósito de R$ 500,00");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está utilizando o cheque especial");
		} else{
			System.out.println("Não está utilizando o cheque especial");
		}
		
		conta.saque(600);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está utilizando o cheque especial");
		} else{
			System.out.println("Não está utilizando o cheque especial");
		}
	}

}
