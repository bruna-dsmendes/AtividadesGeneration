package CollectionArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PosicaoCollectionList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int numeroprocurado, posicao;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		
		numeroprocurado = leia.nextInt();
		posicao = numeros.indexOf(numeroprocurado);
		
		if (posicao != -1) {
			System.out.println("O número " + numeroprocurado + "está localizado na posição: " + posicao);
			
		} else {
			System.out.println("O número " + numeroprocurado + "não foi localizado!");
				
		}
		
		leia.close();
		
		
	}

}
