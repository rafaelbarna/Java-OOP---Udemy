package entidades;

public class Retangulo extends Forma{

	// Atributos
	private double altura;
	private double largura;
	
	// Métodos
	public Retangulo() {
		super();
	}

	public Retangulo(Cor cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double area() {
		return altura * largura;
	}

	// Getters and Setters
	public double getAltura() {
		return altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
}
