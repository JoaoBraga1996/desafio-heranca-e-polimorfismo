package educ360;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Calculadora cal = new Calculadora();

		System.out.println(" numero 1 = ");
		double numero1 = scanner.nextDouble();

		System.out.println(" numero 2 = ");
		double numero2 = scanner.nextDouble();

		double resultado = cal.calcular(numero1, numero2, '+');
		System.out.println("Resultado da soma: " + resultado);

		resultado = cal.calcular(numero1, numero2, '-');
		System.out.println("Resultado da subtração: " + resultado);

		resultado = cal.calcular(numero1, numero2, '*');
		System.out.println("Resultado da multiplicação: " + resultado);

		resultado = cal.calcular(numero1, numero2, '/');
		System.out.println("Resultado da divisão: " + resultado);

		scanner.close();
	}
}
