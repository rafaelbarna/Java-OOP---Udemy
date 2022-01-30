package OP_Introducao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		exercicio_3_Aluno aluno = new exercicio_3_Aluno();

		System.out.println("Digite os dados do Aluno (Nota 0.0 ~ 100.0");
		System.out.print("Nome: ");
		aluno.nome = scanner.next();
		System.out.print("1a Nota: ");
		aluno.nota1 = scanner.nextDouble();
		System.out.print("2a Nota: ");
		aluno.nota2 = scanner.nextDouble();
		System.out.print("3a Nota: ");
		aluno.nota3 = scanner.nextDouble();

		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("Nota insuficiente");
			System.out.printf("Faltam %.2f Pontos%n", aluno.notaRestante());
		}
		else {
			System.out.println("O aluno passou");
		}
		
		scanner.close();
	}
}
