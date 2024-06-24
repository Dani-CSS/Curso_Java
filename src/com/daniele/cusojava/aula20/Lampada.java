package com.daniele.cusojava.aula20;

public class Lampada {
	
	String tamanho;
	String cor;
	String marca;
	String modelo;
	boolean ligada = true;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void mostrarEstado() {
		
		if(ligada) {
			System.out.println("Lâmpada está ligada");			
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}
	
	public void mudarEstado() {
		
		if(ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
