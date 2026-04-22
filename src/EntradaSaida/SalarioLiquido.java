package EntradaSaida;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		//Variaveis
		
		float salariobruto, adicionalnoturno, horaextra, descontos;
		float salarioliquido;
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		System.out.println("salariobruto: R$");
		salariobruto = leia.nextFloat();
		
		System.out.println("adicionalnoturno: R$");
		adicionalnoturno = leia.nextFloat();

		System.out.println("horaextra: R$");
		horaextra = leia.nextFloat();
		
		System.out.println("descontos: R$");
		descontos = leia.nextFloat();
		
		//Processamento 
		salarioliquido = salariobruto + adicionalnoturno + (horaextra * 5) - descontos;
		
		//Saida
		System.out.print("Seu salário será: R$" + salarioliquido);

	}

}
