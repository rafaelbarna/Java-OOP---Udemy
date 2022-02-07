package entidades;

public class PessoaJuridica extends Contribuente {

	// Atributos
	private Integer numeroFuncionarios;
	
	// Métodos
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double taxa() {
		if (numeroFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}

	// Getters and Setters
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	

}
