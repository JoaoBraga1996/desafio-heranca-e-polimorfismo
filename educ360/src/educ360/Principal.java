package educ360;

import java.util.ArrayList;
import java.util.List;

import educ360.entidades.Ebook;
import educ360.entidades.Livro;
import educ360.entidades.LivroFisico;
import educ360.unitarias.CarrinhoDeCompras;

public class Programa {

	public static void main(String[] args) {
		
		LivroFisico livroFisico = new LivroFisico();
		livroFisico.setAutor("João felipe");
		livroFisico.setFrete(10.0);
		livroFisico.setIsbn("1");
		livroFisico.setPeso(2.0);
		livroFisico.setPreco(100.0);
		livroFisico.setTitulo("Vida Do João De Arceburgo-mg");

		Ebook ebook1 = new Ebook();
		ebook1.setAutor("Cadu Braga");
		ebook1.setIsbn("2");
		ebook1.setTamanhoEmMb(5.0);
		ebook1.setPreco(100.0);
		ebook1.setTitulo("Vida Do Cadu De Arceburgo-mg");

		Ebook ebook2 = new Ebook();
		ebook2.setAutor("Carol Braga");
		ebook2.setIsbn("3");
		ebook2.setTamanhoEmMb(6.0);
		ebook2.setPreco(100.0);
		ebook2.setTitulo("Vida Da Carol De Arceburgo-mg");
		

		List<Livro> livros = new ArrayList<>();
		livros.add(ebook1);
		livros.add(ebook2);
		livros.add(livroFisico);

		CarrinhoDeCompras carrinhoDeCompra = new CarrinhoDeCompras();
		carrinhoDeCompra.setListaLivros(livros);

		System.out.println(carrinhoDeCompra.CalcularTotal());

	}

}