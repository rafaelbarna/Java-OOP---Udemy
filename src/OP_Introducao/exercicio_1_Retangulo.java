package OP_Introducao;

public class exercicio_1_Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return 2 * (altura * largura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
	
	public String toString() {
		// %.2f ~ Define o número de casas decimais
		return "\nAltura: " + altura +
				"\nLargura: " + largura +
				"\nArea: " + String.format("%.2f", area()) +
				"\nPerimetro: " + String.format("%.2f", perimetro()) +
				"\nDiagonal: " + String.format("%.2f", diagonal());
	}
}
