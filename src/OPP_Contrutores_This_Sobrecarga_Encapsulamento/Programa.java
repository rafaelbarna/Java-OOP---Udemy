package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Construtor Padrão
		// Produto produto = new Produto();
		
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
		
		// Construtor com Sobrecarga
		// Produto produto = new Produto(nome, preco);
		
		// Retorna Produto cadastrado ~ Como String já formatada utilizando o método toString "modificado"
		System.out.println(produto);
		
		// Adiciona Produto no estoque
		System.out.print("\nQuantos Produtos deseja adicionar em Estoque:");
		quantidade = scanner.nextInt();
		// Atualiza o Objeto Produto com a Quantidade de itens
		produto.adicionaProduto(quantidade);
		System.out.println(produto);
		
		// Remove Produto do estoque
		System.out.println("\nQuantos Produtos deseja remover do Estqoue:");
		// Reutilizando a Variável quantidade
		quantidade = scanner.nextInt();
		// Utiliza a Função removeProduto passando como parametro quantidade
		produto.removeProduto(quantidade);
		System.out.println(produto);
		
		// "Fecha" a Função Scanner
		scanner.close();
	}
}
