package OP_Introducao;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Produto produto = new Produto();
		
		// Leitura de dados do Produto
		System.out.println("Insira dados do Produto:");
		System.out.print("Nome: ");
		produto.nome = scanner.nextLine();
		System.out.print("Preço: ");
		produto.preco = scanner.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = scanner.nextInt();
		
		// Retorna Produto cadastrado ~ Como String já formatada utilizando o método toString "modificado"
		System.out.println(produto);
		
		// Adiciona Produto no estoque
		System.out.print("\nQuantos Produtos deseja adicionar em Estoque:");
		int quantidade = scanner.nextInt();
		// Atualiza o Objeto Produto com a Quantidade de itens
		produto.adicionaProduto(quantidade);
		System.out.println(produto);
		
		// Remove Produto do estoque
		System.out.println("Quantos Produtos deseja remover do Estqoue:");
		// Reutilizando a Variável quantidade
		quantidade = scanner.nextInt();
		// Utiliza a Função removeProduto passando como parametro quantidade
		produto.removeProduto(quantidade);
		System.out.println(produto);
		
		// "Fecha" a Função Scanner
		scanner.close();
	}
}
