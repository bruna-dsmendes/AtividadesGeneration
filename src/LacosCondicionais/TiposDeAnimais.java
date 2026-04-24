package LacosCondicionais;

import java.util.Scanner;

public class TiposDeAnimais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String p1, p2, p3;
		
		System.out.println("Informe a caracteristica: (Vertebrado/Invertebrado)");
		p1 = leia.nextLine();
		
		System.out.println("Informe o grupo: ");
		p2 = leia.nextLine();
		
		System.out.println("Informe o tipo de dieta: ");
		p3 = leia.nextLine();

	if (p1.equalsIgnoreCase("Vertebrado")) {
		if (p2.equalsIgnoreCase("Ave")) {
			if (p3.equalsIgnoreCase("Carnivoro")) {
				System.out.println(("Aguia"));
			} else {
				System.out.println("Pomba");
			}
		} else {
			if (p3.equalsIgnoreCase("onivoro")) {
				System.out.println("Homem");
			} else {
				System.out.println("Vaca");
			}
		}
	}
		if (p1.equalsIgnoreCase("Invertebrado")) {
			if (p2.equalsIgnoreCase("Inseto")) {
				if (p3.equalsIgnoreCase("Hematofago")) {
					System.out.println(("Pulga"));
				} else {
					System.out.println("lagarto");
				}
			} else {
				if (p3.equalsIgnoreCase("onivoro")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
					
				}
			}
		
		} 
	}
}

