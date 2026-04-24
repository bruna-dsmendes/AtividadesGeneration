package Vetores;

import java.util.Scanner;

public class PesquisaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int[] indice = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int encontrarposicao = -1;
		int numeroprocurado, contador;
		
		System.out.println("Digite o número procurado: ");
		numeroprocurado = leia.nextInt();
	
		for (contador = 0; contador < indice.length; contador++) {
			if (indice [contador] == numeroprocurado) {
				encontrarposicao = contador;
				break;
			}
	
		}
		if (encontrarposicao != -1) {
			System.out.println("O número " + numeroprocurado + " está localizado na posição: " + encontrarposicao);
			
		} else {
			System.out.println("O número " + numeroprocurado + " não foi encontrado!");
			
	
			}
		}
	}