package entidades;

public abstract class Contribuente {

	// Atributos
	private String nome;
	private Double rendaAnual;

	//  Métodos
	public Contribuente(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double taxa();
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
}
