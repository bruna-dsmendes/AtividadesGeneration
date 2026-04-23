package LacosDeRepeticao;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
			
		} while (numero !=0);
		System.out.println("A soma dos números positivos é " + soma);
	}

}
