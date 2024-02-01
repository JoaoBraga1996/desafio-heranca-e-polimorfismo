package educ360;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = sc.nextInt();

		System.out.print("Digite um operador (+, -, *, /): ");
		char calculo = sc.next().charAt(0);

		double resultado = 0;
		switch (calculo) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("Divisão por zero não permitida.");
				System.exit(1);
			}
		default:
			System.out.println("Operador inválido,use +, -, *, /.");
			System.exit(1);
			break;

		}

		System.out.println("O resultado é = " + resultado);

		sc.close();
	}

}
