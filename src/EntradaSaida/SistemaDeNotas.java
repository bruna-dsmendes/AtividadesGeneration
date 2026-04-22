package EntradaSaida;

import java.util.Scanner;

public class SistemaDeNotas {

	public static void main(String[] args) {
		
		// Variaveis
		float nota1, nota2, nota3, nota4;
		float mediafinal;
		Scanner leia = new Scanner(System.in);

		
		//Entrada
		
	System.out.println("nota1: ");
	nota1 = leia.nextFloat();
	
	System.out.println("nota2: ");
	nota2 = leia.nextFloat();
	
	System.out.println("nota3: ");
	nota3 = leia.nextFloat();
	
	System.out.println("nota4: ");
	nota4 = leia.nextFloat();
	
	//Processamento
	mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
	
	//Saida
	
	System.out.println("Sua média final será: " + mediafinal);
	if (mediafinal >= 7)
		System.out.println("Aprovado");
	else 
		System.out.println("Reprovado");

	}

}
