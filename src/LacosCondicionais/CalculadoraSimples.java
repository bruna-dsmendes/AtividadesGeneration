package LacosCondicionais;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		//Variaveis
		float num1, num2;
		int operacao;
		Scanner leia = new Scanner(System.in);

		
		//Entrada
		System.out.print("Digite o primeiro valor: ");
		num1 = leia.nextFloat();
		System.out.print("Digite o segundo valor: ");
		num2 = leia.nextFloat();
		
		//Processamento 
		System.out.print("Operacao: ");
		operacao = leia.nextInt();
		
		//Saida
		switch (operacao) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
				
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
				
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
				
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			
			default:
				System.out.println("Operacao inválida!");
				break;
				
		}				


	}

}
