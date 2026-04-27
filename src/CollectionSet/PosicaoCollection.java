package CollectionSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PosicaoCollection {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<>();
		Scanner leia = new Scanner(System.in);

		numeros.add(2); numeros.add(5); numeros.add(1);
		numeros.add(3); numeros.add(4); numeros.add(9);
		numeros.add(7); numeros.add(8); numeros.add(10);
		numeros.add(6);

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroprocurado = leia.nextInt();


		if (numeros.contains(numeroprocurado)) {
			System.out.println("O número " + numeroprocurado + " foi encontrado!");

		} else { 
			System.out.println("O número " + numeroprocurado + " não foi encontrado!");
			
			
		}

	}

}
