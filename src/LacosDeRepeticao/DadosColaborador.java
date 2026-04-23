package LacosDeRepeticao;

import java.util.Scanner;

public class DadosColaborador {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String continua = "S";
		int idade, genero, categoria, totalderespostas = 0, somaidade = 0;
		int backend = 0, frontendmulheres = 0, mobilehomens40 = 0, fullstacknaobinario30 = 0;
		double mediadeidade;
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println("Identidade de gênero (1 a 6): ");
			genero = leia.nextInt();
			System.out.println("Desenvolvedor (1 a 4): ");
			categoria = leia.nextInt();
			
			if (categoria ==1) backend++;
			if ((genero ==1 || genero ==4) && categoria ==2) frontendmulheres++;
			if ((genero ==2 || genero ==5) && categoria ==3 && idade >40) mobilehomens40++;
			if (genero ==3 && categoria ==4 && idade <30) fullstacknaobinario30++;
			
			totalderespostas++;
			somaidade += idade;
			
		System.out.println("Deseja continuar? (s/n)");
		continua = leia.next();

		
		 mediadeidade = (totalderespostas >0) ? (double) somaidade / totalderespostas : 0;
	
		
			System.out.println("RESULTADOS");
			System.out.println("Total de pessoas BackEnd: " + backend);
			System.out.println("Total de mulheres FrontEnd: " + frontendmulheres);
			System.out.println("Total de homens mobile > 40 anos: " + mobilehomens40);
			System.out.println("Total de não binarios fullstack < 30 anos: " + fullstacknaobinario30);
			System.out.println("Total de pessoas que responderam à pesquisa: " + totalderespostas);
			System.out.println("Média de idade das pessoas que responderam: " + mediadeidade);
			
		}
	
	}

}
