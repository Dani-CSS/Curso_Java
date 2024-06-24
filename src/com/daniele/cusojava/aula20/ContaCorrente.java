package com.daniele.cusojava.aula20;

public class ContaCorrente {
	
	String numero;
	String agencia;
	double saldo;
	double limite;
	double limiteEspecial;
	double valorEspecialUsado;
	boolean especial = true;	
	
	
	boolean saque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			} 
			
		} 
		
	}
	
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo > 0;
	}
	
}