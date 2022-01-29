package estruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		if (a % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		s.close();
	}
}
