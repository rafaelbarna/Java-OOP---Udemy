package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto {

	// Atributos
	private Date dataFabricacao;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Métodos
	public Produto_Usado() {
	}
	
	public Produto_Usado(String nome, double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return "Nome: "+ getNome() + "\nFabricação: " + sdf.format(dataFabricacao) + "\nPreço: " + String.format("%.2f", getPreco()); 
	}
	
	// Getters e Setters
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
}
