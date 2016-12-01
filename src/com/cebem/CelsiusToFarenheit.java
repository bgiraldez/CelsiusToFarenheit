package com.cebem;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		CelsiusToFarenheit temperatura = new CelsiusToFarenheit();
		temperatura.iniciar();

	}

	private void iniciar() {
		Scanner teclado = new Scanner(System.in);
		double celsius, farenheit;
		System.out.println("Introduzca una temperatura en Celsius: ");
		celsius = teclado.nextDouble();
		farenheit = 32 + ((9 * celsius) / 5);
		System.out.println("La temperatura en Celsius es de " + celsius + " grados, al convertirla pasamos a "
				+ farenheit + " grados Farenheit.");
		teclado.close();
	}

}
