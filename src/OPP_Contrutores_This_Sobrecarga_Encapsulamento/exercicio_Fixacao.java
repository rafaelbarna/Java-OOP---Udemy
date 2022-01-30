package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

import java.util.Scanner;

public class exercicio_Fixacao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número da Conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Nome do Cliente: ");
		String nomeCliente = scanner.next();
		System.out.print("Efetuar Depósito inicial (S/N): ");
		boolean depositoInicial = scanner.nextBoolean();
		
		Conta conta = new Conta(numeroConta, nomeCliente, depositoInicial);
		System.out.println(conta);
		
	scanner.close();	
	}
}
