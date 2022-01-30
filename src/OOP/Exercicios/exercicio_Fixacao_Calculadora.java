package OOP.Exercicios;

public class exercicio_Fixacao_Calculadora {
	
	public static double IOF = 0.06;

	public static double valorReal(double cotacaoDolar, double valorDolar) {
		return cotacaoDolar * valorDolar * (1.0 + IOF);
	}

}
