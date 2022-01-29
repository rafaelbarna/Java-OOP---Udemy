package OOP;

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
}