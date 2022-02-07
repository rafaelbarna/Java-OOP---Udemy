package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.Produto_Importado;
import entidades.Produto_Usado;

public class APP {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Produto> lista = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número de Produtos: ");
		int numeroProdutos = scanner.nextInt();

		for (int i = 1; i <= numeroProdutos; i++) {

			System.out.print("Nome do Produto: ");
			String nome = scanner.next();
			System.out.print("Preço do Produto: ");
			double preco = scanner.nextDouble();

			System.out.println("Tipo de Produto\n1- Comum\n2- Importado\n3- Usado");
			int opcaoMenu = scanner.nextInt();

			if (opcaoMenu == 1) {
				lista.add(new Produto(nome, preco));
			}

			else if (opcaoMenu == 2) {
				System.out.print("Taxa Alfândegaria: ");
				double taxaAlfandega = scanner.nextDouble();
				lista.add(new Produto_Importado(nome, preco, taxaAlfandega));
			}

			else {
				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(scanner.next());
				lista.add(new Produto_Usado(nome, preco, date));
			}
		}
		
		System.out.println("-- Etiqueta --");
		for (Produto produto : lista) {
			System.out.println(produto.etiquetaPreco() + "\n");
		}

		scanner.close();
	}
}
