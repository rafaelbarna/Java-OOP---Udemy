package OOP.Exercicios;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		exercicio_1_Retangulo retagulo = new exercicio_1_Retangulo();

		System.out.println("Calcula a área de um retângulo");
		System.out.print("Altura: ");
		retagulo.altura = scanner.nextDouble();
		System.out.print("Largura: ");
		retagulo.largura = scanner.nextDouble();
		
		System.out.println(retagulo);
	}
}