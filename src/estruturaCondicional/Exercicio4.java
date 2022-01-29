/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

package estruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int horaInicial = s.nextInt();
		int horaFinal = s.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("Duração de jogo: " + duracao + " horas");
		s.close();
	}
}
