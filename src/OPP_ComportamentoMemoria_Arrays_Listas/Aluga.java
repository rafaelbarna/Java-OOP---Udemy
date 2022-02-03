package OPP_ComportamentoMemoria_Arrays_Listas;

public class Aluga {
	
	private String nome;
	private String email;

	public Aluga(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String toString() {
		return nome + ", " + email;
	}

}
