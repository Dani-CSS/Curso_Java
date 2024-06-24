package com.daniele.cursojava.aula33.labs;

import com.daniele.cusojava.aula20.Lampada;

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada fluorescente = new Lampada();
		
		fluorescente.ligar();
		
		fluorescente.mostrarEstado();
		
		fluorescente.desligar();
		
		fluorescente.mostrarEstado();
		
		fluorescente.mudarEstado();	
		
		fluorescente.mostrarEstado();		

	}

}
