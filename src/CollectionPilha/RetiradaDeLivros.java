package CollectionPilha;

import java.util.Scanner;
import java.util.Stack;

public class RetiradaDeLivros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<>();
		int opcao, contador;
		
		do {
			System.out.println("\n\n**************************MENU*************************");
			System.out.println(   "1 - Adicionar um novo livro a coleção.");
			System.out.println(   "2 - Listar todos os livros da coleção.");
			System.out.println(   "3 - Emprestimo de livro.");
			System.out.println(   "4 - Retirar um livro da coleção.");
			System.out.println(   "0 - Sair");
			System.out.println("*******************************************************"); 
			
			System.out.println("Entre com a opção desejada: "); 
		
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao)	{
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nomedolivro = leia.nextLine();
				pilha.push(nomedolivro);
				System.out.println("\nLivro adicionado!");{
					
				}
				break;
		
			case 2:
				if(pilha.isEmpty()) {
				System.out.println("\nA coleção de livros está vazia!");
				} else {
				System.out.println("\nLista de livros na coleção: "); 
				for (contador = pilha.size() - 1; contador >= 0; contador--) { 
					System.out.println(pilha.get(contador));
				}
				break;
				}
				
			case 3: 	
				if (pilha.isEmpty()) {
					System.out.println("\nA coleção de livros está vazia!");
					} else {
				
					System.out.print("Livro " + pilha.pop() + " foi emprestado!");
					System.out.println("\n\nOs livros: " + pilha + " estão disponiveis na coleção.");
					}
					break;
				
			case 4:
				if (pilha.isEmpty()) {
				System.out.println("\nA coleção de livros está vazia!");
				} else {
				pilha.pop();
				System.out.print("O livro " + pilha.pop() +  " foi retirado da coleção para doação!\n\n");
				System.out.println("\n\nOs livros: " + pilha + " estão disponiveis na coleção.");
			
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
