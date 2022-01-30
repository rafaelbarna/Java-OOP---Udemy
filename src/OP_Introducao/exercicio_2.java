package OP_Introducao;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		exercicio_2_Funcionario funcionario = new exercicio_2_Funcionario();
		
		System.out.println("Dados do Funcionário");
		System.out.print("Nome: ");
		funcionario.nome = scanner.next();
		System.out.print("Salário Bruto: ");
		funcionario.salarioBruto = scanner.nextDouble();
		System.out.print("Taxas:");
		funcionario.taxa = scanner.nextDouble();
		
		System.out.print("\nFuncionário: " + funcionario);
		System.out.print("\n% de aumento de salário: ");
		double porcentagem = scanner.nextDouble();
		funcionario.aumentaSalario(porcentagem);
		
		System.out.println("\nDados atualizados:" + funcionario);
		scanner.close();
	}
}
