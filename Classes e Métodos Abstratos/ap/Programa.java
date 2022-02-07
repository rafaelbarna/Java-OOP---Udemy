package ap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Cor;
import entidades.Forma;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("Número de Objetos: ");
		int numeroObjetos = scanner.nextInt();
		
		for(int i = 1; i <= numeroObjetos; i++) {
			
			System.out.print("Retângulo ou Circulo: ");
			char ch = scanner.next().charAt(0);
			System.out.println("Preto, Azul ou Vermelho");
			Cor cor = Cor.valueOf(scanner.next());
		
			
			if(ch == 'r') {
				System.out.print("Altura: ");
				double altura = scanner.nextDouble();
				System.out.println("Largura: ");
				double largura = scanner.nextDouble();
				lista.add(new Retangulo(cor, altura, largura));
			}
			else {
				System.out.print("Raio: ");
				double raio = scanner.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println("Área das Formas");
		for(Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		scanner.close();
	}
}
