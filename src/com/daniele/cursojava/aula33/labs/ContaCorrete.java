package com.daniele.cursojava.aula33.labs;

public class ContaCorrete {
	
	private String numero;
	private String agencia;
	private boolean especial = true;
	private double limiteEspecial;
	private double saldo;
	private double limite;	
	private double valorEspecialUsado;
	
	
	public ContaCorrete() {
		
	}
		
	public ContaCorrete(String numero, String agencia, double saldo, double limite, double limiteEspecial,
			double valorEspecialUsado, boolean especial) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.especial = especial;
	}
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}	
	
	public boolean saque(double quantiaASacar) {
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
	
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + getSaldo());
	}
	
	public boolean verificarUsoChequeEspecial() {
		return getSaldo() > 0;
	}
}
