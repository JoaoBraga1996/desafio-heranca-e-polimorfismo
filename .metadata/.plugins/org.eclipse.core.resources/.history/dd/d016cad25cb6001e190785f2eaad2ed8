package educ360;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numeroTentativa;

		int numeroAleatorio = random.nextInt(100);

		do {

			System.out.println("Digite um numero pra tentar adivinhar de 0 a 100");
			numeroTentativa = sc.nextInt();

			if (numeroTentativa < 0 || numeroTentativa > 100) {
				System.out.println("Digite um numero entre 0 a 100 pra poder adivinhar");

			} else if (numeroTentativa < numeroAleatorio) {
				System.out.println("Digite um maior");
			}

			else if (numeroTentativa > numeroAleatorio) {
				System.out.println("Digite um numero menor");
			}

		} while ((numeroTentativa != numeroAleatorio));

		System.out.println("Você acertou o numero");

		sc.close();
	}

}
