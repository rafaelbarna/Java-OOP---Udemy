package OP_Introducao;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double totalEstoque() {
		return preco * quantidade;
	}

	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	// Implementa minha versão do toString - Sobreposição - Aula de Herança
	public String toString() {
		// %.2f ~ Define o número de casas decimais
		return "Nome: " + nome + ", Preco: " + String.format("%.2f", preco) + ". Quantidade: " + quantidade + ". Preço total em estoque: " + String.format("%.2f", totalEstoque());
	}
}