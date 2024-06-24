package com.daniele.cusojava.aula20;

public class TesteLampada {
	
	public static void main(String[] args) {
		
		Lampada fluorescente = new Lampada();
		
		fluorescente.ligar();
		
		fluorescente.mostrarEstado();
		
		fluorescente.desligar();
		
		fluorescente.mudarEstado();		
		
	}
	

}
