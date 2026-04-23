package LacosDeRepeticao;

import java.util.Scanner;

public class MediaDeMultiplos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		float media = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}
		} while (numero != 0);
		
		if (contador >0) {
			media = (float) soma / contador;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
			
		} else {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
			
		}
		
	}

}
