package educ360.entidades;

public class Ebook extends Livro {

	private double tamanhoEmMb;

	public Ebook() {
	}

	public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
		super(titulo, autor, isbn, preco);
		this.tamanhoEmMb = tamanhoEmMb;
	}

	public double getTamanhoEmMb() {
		return tamanhoEmMb;
	}

	public void setTamanhoEmMb(double tamanhoEmMb) {
		this.tamanhoEmMb = tamanhoEmMb;
	}

	@Override
	public String toString() {
		return "Ebook [tamanhoEmMb=" + tamanhoEmMb + "]";
	}

	@Override
	public double calcularPrecoTotal() {
		return preco;
	}

}
