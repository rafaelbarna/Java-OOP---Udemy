package OOP;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos_Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = scanner.nextDouble();
		
		double circunferencia = MembrosEstaticos_Util.circunferencia(raio);
		double volume = MembrosEstaticos_Util.volume(raio);
		
		System.out.printf("Circumferencia: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Valor de PI: %.2f%n", MembrosEstaticos_Util.PI);
		
		scanner.close();
	}
}
