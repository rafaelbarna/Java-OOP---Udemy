package OPP_Contrutores_This_Sobrecarga_Encapsulamento;

public class Conta {
	
	private int numeroConta;
	private String nomeCliente;
	private double deposito;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}
	
	public Conta(int numeroConta, String nomeCliente, double deposito) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		deposito(deposito);
	}
	
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double saque) {
		saldo -= saque;
	}
	
	// Override
	public String toString() {
		return "\nNumero da Conta: " + numeroConta + "\nNome Cliente: " + nomeCliente + "Saldo: " + saldo;
	}

	// Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
}
