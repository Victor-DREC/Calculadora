package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1;
		r1 = c1.sumar(4, 2);
		
		System.out.println("Resultado Suma: " + r1);
		
		int r2;
		r2 = c1.restar(4, 2);
		
		System.out.println("Resultado Resta: " + r2);
		
		double multiplicar;
		multiplicar = c1.multiplicar(10, 5);
		
		System.out.println("Resultado Multiplicación: " + multiplicar);
		
		double dividir;
		dividir = c1.dividir(10, 2);
		
		System.out.println("Resultado Divición: " + dividir);
		
		double promediar;
		promediar = c1.promediar(10, 8, 9);
		
		System.out.println("Resultado Promedio: " + promediar);
		
		c1.mostrarResultado();
		

	}

}
