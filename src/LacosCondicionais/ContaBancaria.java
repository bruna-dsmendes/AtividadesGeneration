package LacosCondicionais;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		//Variaveis
		float saldo = 1000.00f, valorsaque, valordeposito;
		int operacao;
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		System.out.print("Operação: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
			case 1:
				System.out.println("\nOperação - Saldo");
				System.out.printf("Saldo: R$ %.2f\n", saldo);
				break;
			
			case 2:
				System.out.print("Valor : R$ ");
				valorsaque = leia.nextFloat();
				System.out.println("\nOperaçao - Saque");
				
				if (valorsaque <= saldo) {
					saldo -= valorsaque;
					System.out.printf("Novo saldo: R$ %.2f\n", saldo);
				}else  {
					System.out.println("Saldo Insuficiente.");
					break;
				}
			
			case 3:
				System.out.print("Valor: R$ ");
				valordeposito = leia.nextFloat();
				System.out.println("\nOperaçao - Depósito");
				
				saldo += valordeposito;
				System.out.printf("Novo saldo: R$ %.2f\n", saldo);
				break;
				
			default:
				System.out.print("Valor: R$ ");
				valordeposito = leia.nextFloat();
				System.out.println("\nOperaçao inválida.");
				break;
				
			
		
		}
		leia.close();
	}

}
