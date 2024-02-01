package educ360;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroPrimo;
		int divisores = 0;

		System.out.println("Digite um numero primo");
		numeroPrimo = sc.nextInt();

		for (int i = 1; i <= numeroPrimo; i++) {
			if (numeroPrimo % i == 0) {
				divisores++;
			}

		}

		if (divisores == 2) {
			System.out.println("Numero é primo");
		}

		else {
			System.out.println("Numero não é primo");
		}
		
		sc.close();

	}

}
