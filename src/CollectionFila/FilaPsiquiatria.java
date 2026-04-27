package CollectionFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaPsiquiatria {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		
		int opcao; 
		
		do {
			System.out.println("**************************MENU*************************");
			System.out.println(   "1 - Adicionar paciente na fila.");
			System.out.println(   "2 - Listas todos os clientes.");
			System.out.println(   "3 - Paciente agendado.");
			System.out.println(   "4 - Paciente retirado da fila por desistencia ou óbito");
			System.out.println(   "0 - Sair");
			System.out.println("*******************************************************"); 
			
			System.out.println("Entre com a opção desejada: "); 
			
			opcao = leia.nextInt();
			
			switch (opcao)	{
			case 1:
				System.out.print("Digite o nome do paciente: ");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("\nPaciente incluido na fila!");
				break;
				
			case 2:
				if(fila.isEmpty()) {
				System.out.println("\nA fila está vazia!");
				} else {
				System.out.println("\nLista de pacientes da fila de espera: "); 
				for (String paciente : fila) { 
					System.out.println(paciente);
				}
				
				break;
				}
				
			case 3: 	
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					} else {
					String removido = fila.poll();
					System.out.print("\n\nO paciente " + removido + " ou familiar solicitou retirada da fila.\n\n");
					}
					break;
				
			case 4:
				if (fila.isEmpty()) {
				System.out.println("\nA fila está vazia!");
				} else {
				String removido = fila.poll();
				System.out.print("\n\nO paciente " + removido + " foi chamado!\n\n");
				}
				break;
				
			case 0:
				System.out.println("\nPrograma finalizado.");
				break;
				
			default:
				System.out.println("\nOpção inválida!");
				break;
				
		
			} 
		} while(opcao != 0);
	}
}
 