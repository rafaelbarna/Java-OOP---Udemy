package entidades;

public class Produto_Importado extends Produto {

	// Atributos
	private Double taxaAlfandega;
	
	// Méotodos
	public Produto_Importado() {
	}

	public Produto_Importado(String nome, double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double precoTotal() {
		return getPreco() + taxaAlfandega;
	}
	
	@Override
	public String etiquetaPreco() {
		return "Nome: "+ getNome() + "\nTaxa: " + String.format("%.2f", getTaxaAlfandega()) + "\nPreço Total: " + String.format("%.2f", getPreco()); 
	}
	
	// Getters e Setters
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	
}
