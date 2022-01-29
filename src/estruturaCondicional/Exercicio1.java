package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a < 0) {
			System.out.println("Valor negativo");
		} else {
			System.out.println("Valor positivo");
		}

		s.close();
	}
}
