package OPP_ComportamentoMemoria_Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Vetor[] vect = new Vetor[n];
		
		for (int i = 0; i < vect.length; i++) {
			String nome = scanner.next();
			double valor = scanner.nextDouble();
			vect[i] = new Vetor(nome, valor);
		}
		
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getValor();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Preço médio: %.2f%n", media);
		
		scanner.close();
	}
}
