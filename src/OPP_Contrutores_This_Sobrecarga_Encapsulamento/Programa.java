package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Leitura de dados do Produto
		System.out.println("Insira dados do Produto:");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Preço: ");
		double preco = scanner.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = scanner.nextInt();

		// Construtor com Parâmetros
		Produto produto = new Produto(nome, preco, quantidade);
		System.out.println(produto);
		
		produto.setNome("TV 8k");
		System.out.println("Nome atualizado: " + produto.getNome());
		produto.setPreco(9000);
		System.out.println("Preço atualizado: " + produto.getPreco());

		// Adiciona Produto no estoque
		System.out.print("\nQuantos Produtos deseja adicionar em Estoque:");
		quantidade = scanner.nextInt();
		produto.adicionaProduto(quantidade);
		System.out.println(produto);

		// Remove Produto do estoque
		System.out.println("\nQuantos Produtos deseja remover do Estqoue:");
		quantidade = scanner.nextInt();
		produto.removeProduto(quantidade);
		System.out.println(produto);

		scanner.close();
	}
}
