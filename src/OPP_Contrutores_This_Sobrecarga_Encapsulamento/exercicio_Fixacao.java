package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_Fixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Conta conta;

		System.out.println("Número da Conta: ");
		int numeroConta = scanner.nextInt();
		System.out.println("Nome do Cliente: ");
		String nomeCliente = scanner.next();
		System.out.println("Efetuar Depósito inicial (S/N): ");
		char depositoInicial = scanner.next().charAt(0);

		if (depositoInicial == 's') {
			System.out.println("Valor: ");
			double valorDeposito = scanner.nextDouble();
			conta = new Conta(numeroConta, nomeCliente, valorDeposito);
		} else {
			conta = new Conta(numeroConta, nomeCliente);
		}

		System.out.println(conta);

		System.out.println("Depósito: ");
		double valorDeposito = scanner.nextDouble();
		conta.deposito(valorDeposito);

		System.out.println(conta);

		System.out.println("Saque: ");
		double valorSaque = scanner.nextDouble();
		conta.saque(valorSaque);

		System.out.println(conta);

		scanner.close();
	}
}
