// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente

package estruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println(a + " e " + b + " são multiplos");
		}
		else {
			System.out.println(a + " e " + b + " não são multiplos");
		}
		
		s.close();
	}
}
