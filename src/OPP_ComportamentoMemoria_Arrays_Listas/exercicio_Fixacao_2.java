package OPP_ComportamentoMemoria_Arrays_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Fixacao_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Número de Funcionários: ");
		int numeroFuncionario = scanner.nextInt();

		for (int i = 1; i <= numeroFuncionario; i++) {

			System.out.print("ID: ");
			int idFuncionario = scanner.nextInt();

			while (procuraId(lista, idFuncionario)) {
				System.out.print("ID inválido: ");
				idFuncionario = scanner.nextInt();
			}

			System.out.print("Nome: ");
			String nomeFuncionario = scanner.next();

			System.out.print("Salário: ");
			double salarioFuncionario = scanner.nextInt();

			lista.add(new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario));
		}

		System.out.print("Insira o ID do Funcionario que deseja aumentar o salário: ");
		int id = scanner.nextInt();
		Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Funcionário não encontrado");
		} else {
			System.out.print("Porcentagem: ");
			double percentage = scanner.nextDouble();
			func.aumentaSalario(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario obj : lista) {
			System.out.println(obj);
		}

		scanner.close();
	}

	public static boolean procuraId(List<Funcionario> lista, int idFuncionario) {

		Funcionario func = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		return func != null;
	}
}
