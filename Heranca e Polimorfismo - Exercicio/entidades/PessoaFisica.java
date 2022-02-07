package entidades;

public class PessoaFisica extends Contribuente{
	
	private Double gastoMensal;
	
	// Métodos
	public PessoaFisica(String nome, Double rendaAnual, Double gastoMensal) {
		super(nome, rendaAnual);
		this.gastoMensal = gastoMensal;
	}
	
	@Override
	public Double taxa() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - gastoMensal * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastoMensal * 0.5;
		}
	}

	// Getters and Setters
	public Double getGastoMensal() {
		return gastoMensal;
	}

	public void setGastoMensal(Double gastoMensal) {
		this.gastoMensal = gastoMensal;
	}
}
