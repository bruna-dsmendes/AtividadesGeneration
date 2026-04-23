package LacosDeRepeticao;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, menoresde21 = 0, maioresde50 = 0;
		
		while (idade >= 0) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
		if (idade >=0)
			if (idade <21) {
			menoresde21++;
			
		}else if (idade >50) {
			maioresde50++;
			
		}
	}
		System.out.println("Total de pessoas menores de 21 anos: " + menoresde21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maioresde50);
		
}
}
