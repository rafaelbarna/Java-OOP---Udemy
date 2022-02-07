package entidades;

public class Produto {
	
	// Atributos
	private String nome;
	private double preco;
	
	// Métodos
	public Produto() {
	}
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String etiquetaPreco() {
		return "\nNome: "+ nome + "\nPreço: " + String.format("%.2f", preco); 
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
