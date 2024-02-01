package educ360.unitarias;

import java.util.ArrayList;
import java.util.List;

import educ360.entidades.Livro;

public class CarrinhoDeCompras {

	private List<Livro> listaLivros = new ArrayList<>();

	public CarrinhoDeCompras() {
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public double CalcularTotal() {
		double soma = 0.0;
		for (Livro list : listaLivros) {
			soma += list.calcularPrecoTotal();

		}

		return soma;
	}

}
