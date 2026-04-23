package LacosCondicionais;

import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {
		
	// Variaveis
		Scanner leia = new Scanner(System.in);
		int idade;
		String nomedodoador;
		boolean primeiradoacao;
		
		
	// Entrada
		System.out.println("Digite o nome do doador: ");
		nomedodoador = leia.next();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doaçao? ");
		primeiradoacao = leia.nextBoolean();
		
	//Processamento	
		boolean apto = false;
	
		if (idade >= 18 && idade <= 69) {
			if (primeiradoacao && idade >=60 && idade <=69) {
				apto = false;
			} else 
				{apto = true; }
			
		}
		else { apto = false;
		} 
		leia.close();
		
	//Saida
		if (apto) {
			System.out.println(nomedodoador + " está apto para doar sangue!");
		} else {
			System.out.println(nomedodoador + " não está apto para doar sangue!");
			
		}
	
	}		
}
