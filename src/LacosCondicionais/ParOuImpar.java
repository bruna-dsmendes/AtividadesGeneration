package LacosCondicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		//Variavel
		Scanner leia = new Scanner(System.in);
		int numero;
		
		
		//Entrada
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		//Processamento
		String paridade = (numero % 2 ==0) ? "par" : "impar";
		String sinal = "";
		if (numero > 0) {
			sinal = "positivo!";
			
		}else if (numero < 0) {
			sinal = "negativo!";
			
		}

		//Saida
		System.out.println("O número " + numero + " é " + paridade + " e " + sinal + "! ");

			

	}

}
