package educ360.entidades;

import java.util.Objects;

public abstract class Livro {

	protected String titulo;
	protected String autor;
	protected String isbn;
	protected double preco;

	public Livro() {
	}

	public Livro(String titulo, String autor, String isbn, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public abstract double calcularPrecoTotal();

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", preco=" + preco + "]";
	}

}
