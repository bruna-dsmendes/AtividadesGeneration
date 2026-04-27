package CollectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoresUsuario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);	
		
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("Digite 5 cores: ");
		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Cor " + (contador + 1) + ": ");
			cores.add(leia.nextLine());
		
		}
		
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
			
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
			
		}
	
	}

}
