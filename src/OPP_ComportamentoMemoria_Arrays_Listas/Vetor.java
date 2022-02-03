package OPP_ComportamentoMemoria_Arrays_Listas;

public class Vetor {

	
	private String nome;
	private Double valor;
	
	public Vetor(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String toString() {
		return nome + ", " + valor;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
