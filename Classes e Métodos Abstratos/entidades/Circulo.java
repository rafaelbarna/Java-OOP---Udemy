package entidades;

public class Circulo extends Forma {

	// Atributos
	private double raio;

	// Métodos
	public Circulo() {
		
	}
	
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

	// Getters and Setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
