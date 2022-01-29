package estruturaSequencial;

public class SaidaDados {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Celular";
		String produto3 = "Cadeira";

		int codigo1 = 720;
		int codigo2 = 420;
		int codigo3 = 120;

		double preco1 = 2000.00;
		double preco2 = 1500.00;
		double preco3 = 420.00;

		System.out.printf("Produto: %s - Código: %d - Preço: %.2f", produto1, codigo1, preco1);
		System.out.printf("\nProduto: %s - Código: %d - Preço: %.2f", produto2, codigo2, preco2);
		System.out.printf("\nProduto: %s - Código: %d - Preço: %.2f", produto3, codigo3, preco3);
	}
}
