package atelier02;

// classe testAB dans la 2ème partie du TD//

public class testAB {
	
	/* testAB contient la méthode main initialisant une variable i à la valeur 1 et éxécutat m fois la méthode divise
	 * 
	 * la méthode divise a comme paramètre : 
	 *i à la première itération, aux itérations suviantes le résultat du précédent appel à la méthode divise
	 *
	 */
	public static void main(String[] args) {
		int i = 1, m = 10, x=0;
		for (int j = 0; j < m; j++) {
			if (j == 0)
				x = B.divise(i);
			else
				x = B.divise(x);
			
			System.out.println(x);
		}
	}


}

