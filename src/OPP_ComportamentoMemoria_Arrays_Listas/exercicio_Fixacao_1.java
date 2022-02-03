package OPP_ComportamentoMemoria_Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_Fixacao_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Aluga[] vect = new Aluga[10];
		
		System.out.print("Reservar quartos: ");
		int v = scanner.nextInt();

		for (int i = 1; i <= v; i++) {
			System.out.print("Nome: ");
			String nome = scanner.next();
			System.out.print("Email: ");
			String email = scanner.next();
			System.out.print("Número do Quarto: ");
			int numeroQuarto = scanner.nextInt();
			vect[numeroQuarto] = new Aluga(nome, email);
		}
		
		System.out.print("Quartos ocupados:\n");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println("Quarto: " + vect[i]);
			}
		}
		
		scanner.close();
	}

}
