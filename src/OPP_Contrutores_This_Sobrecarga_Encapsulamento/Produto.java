package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

public class Produto {

	// Atributos
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor
	public Produto() {
	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Sobrecarga do Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	// Métodos
	public double totalEstoque() {
		return preco * quantidade;
	}

	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	// Implementa versão customizada do toString()
	public String toString() {
		// %.2f ~ Define o número de casas decimais
		return "\nNome: " + nome + ", Preco: R$" + String.format("%.2f", preco) + ". Quantidade: " + quantidade
				+ ". Valor total em estoque: R$" + String.format("%.2f", totalEstoque());
	}
}