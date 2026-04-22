package LacosCondicionais;

import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		
		String nome, cargo = "";
		int codigodocargo;
		float salario, reajuste = 0, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Codigo do cargo (De 1 a 6): ");
		codigodocargo = leia.nextInt();
		
		System.out.print("Salario: R$ ");
		salario = leia.nextFloat();
		
		switch (codigodocargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
			
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
			
		case 3:	
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;	
			
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
			
		case 6:
			cargo = "Tecnico de TI";
			reajuste = 0.08f;
			break;
		}
		
	novosalario = salario + (reajuste * salario);
	
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salario: R$ %.2f\n", novosalario);

	}

}
