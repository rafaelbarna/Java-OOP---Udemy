package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuente;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Contribuente> lista = new ArrayList<>();

		System.out.print("Número de Contribuentes: ");
		int numeroContribuentes = scanner.nextInt();

		for (int i = 1; i <= numeroContribuentes; i++) {

			System.out.print("1 - Pessoa Física\n2 - Pessoa Juridica");
			int tipoPessoa = scanner.nextInt();
			
			System.out.print("Nome: ");
			String nome = scanner.next();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = scanner.nextDouble();
			
			if(tipoPessoa == 1) {
				System.out.println("Gasto Mensal: ");
				double gastoMensal = scanner.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastoMensal));
			}
			else {
				System.out.print("Número de Funcionários: ");
				int numeroFuncionarios = scanner.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		double contribuicaoTotal = 0.0;
		System.out.println("Contribuição total: ");
		for (Contribuente contribuente : lista) {
			double taxa = contribuente.taxa();
			System.out.println(contribuente.getNome() + ": R$ " + String.format("%.2f", taxa));
			contribuicaoTotal += taxa;
		}
		
		System.out.println();
		System.out.println("Contribuição total: R$ " + String.format("%.2f", contribuicaoTotal));
		
		scanner.close();
	}
}
