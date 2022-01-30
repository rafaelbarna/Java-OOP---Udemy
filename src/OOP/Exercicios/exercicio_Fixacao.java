package OOP.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_Fixacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cotação do Dólar: ");
		double cotacaoDolar = scanner.nextDouble();
		
		System.out.print("Quantos Dólares deseja comprar: ");
		double valorDolar = scanner.nextDouble();
		
		double valorReal = exercicio_Fixacao_Calculadora.valorReal(cotacaoDolar, valorDolar);
		System.out.println("IOF: + 6%");
		System.out.printf("R$: %.2f%n", valorReal);
	}
}
