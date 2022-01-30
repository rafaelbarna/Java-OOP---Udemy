package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

public class Produto {

	// Atributos
	public String nome;
	public double preco;
	public int quantidade;

	// Construtor ~ Geralmente colocado depois dos Atributos e antes dos Métodos
	// ~ Executa no momento da Instânciação do Objeto
	// public NomeDaClasse(parâmetros, parâmetros, parâmetros)
	public Produto(String nome, double preco, int quantidade) {
		// Corpo do Contrutor
		// this. ~ Referencia ao Atributo do próprio Objeto
		// = variavel ~ Referencia o Parâmetro
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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
		return "Nome: " + nome + ", Preco: R$" + String.format("%.2f", preco) + ". Quantidade: " + quantidade + ". Valor total em estoque: R$" + String.format("%.2f", totalEstoque());
	}
}