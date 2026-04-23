package LacosDeRepeticao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int pares = 0, numero, contador;
			int impares = 0;
			
			for (contador = 1; contador < 11; contador++ ) {
				System.out.print("Digite o " + contador + "º número: ");
				numero = leia.nextInt();
				
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
				
			}
}
			System.out.println("Total de número pares: " + pares);
			System.out.println("Total de número impares:" + impares);

		}
		
	}	
}
