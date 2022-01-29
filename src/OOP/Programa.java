package OOP;

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
		
		System.out.println("");
		
	}
}
