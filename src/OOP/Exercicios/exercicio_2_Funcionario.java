package OOP.Exercicios;

public class exercicio_2_Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double aumentaSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return "\nNome: " + nome +
				"\nSalário Liquido: " + String.format("%.2f", salarioLiquido());
	}
}
