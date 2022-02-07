package OPP_ComportamentoMemoria_Arrays_Listas;


public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	// Métodos
	public Funcionario() {
	}
	
	public Funcionario(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
		this.id = idFuncionario;
		this.nome = nomeFuncionario;
		this.salario = salarioFuncionario;
	}

	public void aumentaSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	// Override
	public String toString() {
		return "ID: " + id + "\nNome: " + nome + "\nSalário: " + String.format("%.2f", salario);
	}
	
	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
