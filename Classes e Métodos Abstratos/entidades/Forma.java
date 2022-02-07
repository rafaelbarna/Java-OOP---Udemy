package entidades;

public abstract class Forma {

	// Atributos
	private Cor cor;

	// Métodos
	public Forma() {
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();

	// Getters and Setters
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
}
