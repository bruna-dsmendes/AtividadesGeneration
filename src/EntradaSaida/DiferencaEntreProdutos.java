package EntradaSaida;

import java.util.Scanner;

public class DiferencaEntreProdutos {

	public static void main(String[] args) {
		
		// Variaveis
		float salgadinho, refrigerante, lanche, suconatural;
		float diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		System.out.println("salgadinho: ");
		salgadinho = leia.nextFloat();
		
		System.out.println("refrigerante: ");
		refrigerante = leia.nextFloat();
		
		System.out.println("lanche: ");
		lanche = leia.nextFloat();
		
		System.out.println("suconatural ");
		suconatural = leia.nextFloat();
		
		//Processamento
		diferenca = (salgadinho * refrigerante) - (lanche * suconatural);
				
		//Saida
		System.out.println("A diferença entre os produtos é de: " + diferenca + ".");

	}

}
