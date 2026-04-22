package LacosCondicionais;

import java.util.Scanner;

public class TresValores {

	public static void main(String[] args) {

		//Variaveis
		
		Scanner leia = new Scanner(System.in);
		int a, b, c, soma;
		
		//Entrada
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
		
		//Processamento
		soma = a + b;
		
		//Saida
		if (soma > c) {
			System.out.println(a + "+" + b + "=" + soma + ">" + c);
			System.out.println("A soma de a + b é maior que o valor de c.");
			
		}else if (soma < c) {
			System.out.println(a + "+" + b + "=" + soma + "<" + c);
			System.out.println("A soma de a + b é menor que o valor de c.");
			
		}else {
			System.out.println(a + "+" + b + "=" + soma + "=" + c);
			System.out.println("A soma de a + b é igual ao valor de c.");
			
		}
		
	}

}
