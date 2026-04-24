package Vetores;

import java.util.Scanner;

public class VetorImparPar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int soma = 0, contador;
		int [] vetor = new int[10]; 
		int par = 0, impar = 0;
		
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println("Digite o " + (contador + 1) + " número: ");
			vetor [contador] = leia.nextInt();
			soma += vetor[contador];
		}
		
		System.out.println("\nElementos impares: ");
		for (contador = 1; contador < 10; contador +=2) {
			System.out.print(vetor[contador] + " ");
		}
		
		System.out.println("\nElementos pares: ");
		for (int num : vetor) {
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
			
		}
		double media = (double) soma/10;
		
		System.out.println("\n\nSoma: " + soma);
		System.out.printf("Média: %.2f\n", media);
		
		
		} 
		
	}
