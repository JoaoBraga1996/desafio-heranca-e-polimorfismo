package educ360;

public class Calculadora {

	public static double calcular(double numero1, double numero2, char operacao) {
		switch (operacao) {
		case '+':
			return calcularSoma(numero1, numero2);
		case '-':
			return calcularSubtracao(numero1, numero2);
		case '*':
			return calcularMultiplicacao(numero1, numero2);
		case '/':
			return calcularDivisao(numero1, numero2);
		default:
			throw new IllegalArgumentException("Operação inválida");
		}
	}

	private static double calcularSoma(double numero1, double numero2) {
		return numero1 + numero2;
	}

	private static double calcularSubtracao(double numero1, double numero2) {
		return numero1 - numero2;
	}

	private static double calcularMultiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}

	private static double calcularDivisao(double numero1, double numero2) {
		if (numero2 == 0) {
			throw new ArithmeticException("Divisão por zero não é permitida");
		}
		return numero1 / numero2;
	}

}
