package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElementosCollectSet {

	public static void main(String[] args) {
		
		Set<Integer> setnumeros = new HashSet<>();
		Scanner leia = new Scanner(System.in);
		int num; 
		
		System.out.println("Digite 10 números inteiros não repetidos: "); {
			
		
	
		} while(setnumeros.size() < 10) {
		System.out.print("Número " + (setnumeros.size() + 1) + ": ");
		num = leia.nextInt();
	
		setnumeros.add(num);
		
		System.out.println("\nListas dados do Set: ");
		Iterator<Integer> iterator = setnumeros.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			}
	
		}
		leia.close();
	}
}

