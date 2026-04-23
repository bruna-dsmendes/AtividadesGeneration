package LacosCondicionais;

import java.util.Scanner;

public class CodigoLanches {

	public static void main(String[] args) {
		
	//Variaveis
		int codigo, quantidade;
		String produto = "";
		double preco = 0, valortotal; 
		
		Scanner leia = new Scanner(System.in);
		
	//Entrada
		System.out.println("Codigo do produto: ");
		codigo = leia.nextInt();
		System.out.println("Quantidade de itens: ");
		quantidade = leia.nextInt();
		
		
		switch(codigo)  {
		case 1:
			produto = "cachorro quente";
			preco = 10;
			break;
			
		case 2:
			produto =  "x-salada";
			preco = 15;
			break;
			
		case 3:
			produto = "x-bacon";
			preco = 18;
			break;
			
		case 4:
			produto = "bauru";
			preco = 12;
			break;
			
		case 5:
			produto = "refrigerante";
			preco = 8;
			break;
			
		case 6:
			produto = "suco de laranja";
			preco = 13;
			break;
			
		
		}
		
		leia.close();
		
		// Processamento
		
	valortotal = quantidade * preco;
	
		//Saida
		System.out.println("Produto: " + produto);
		System.out.printf("Total: R$ %f", valortotal);
		
		
	}

}
