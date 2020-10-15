package atelier02;

public class B {
	
	// la classe B est utilisée dans le test AB //
		
		/* Ceci est un commentaire sur plusieurs ligne pour décrire la classe B
		 * 
		 *B contient la méthode divise 
		 * elle retourne la valeur n/2 si un entier n passé en paramètre est divisible par 13
		 * 
		 * n+2 dans le cas contraire
		 */
		public static int divise(int n) {
			if (A.treize(n) == true)
				return n/2;
			else return n+2;
		}

	}
