package EntradaSaida;

import java.util.Scanner;

public class AbonoSalarial {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o valor de abono: ");
		float abono = leia.nextFloat();
		
		float novo_salario = salario + abono;
		
		System.out.println("Seu novo salario será: R$" + novo_salario + "."); 


	}

}
