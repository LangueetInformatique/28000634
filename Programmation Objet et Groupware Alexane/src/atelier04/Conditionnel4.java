//Soit le programme (disponible sur Git)
//Université Paris-Sorbonne public static void main(String[] args) {
//int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
//int p6;
//...
//System.out.println(p6) ;
//}
//Exercice 4 : Ajouter les instructions structurées par des branchements conditionnels permettant
//d’obtenir la médiane des variables p1, p2, p3, p4, p5 dans la variable p6.

package atelier04;

public class Conditionnel4{
	
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;


			mediane(p1, p2, p3, p4, p5);
			mediane(p5, p2, p3, p4, p1);
			mediane(p4, p2, p3, p5, p1);
			mediane(p2, p1, p3, p4, p5);
			mediane(p2, p1, p3, p5, p4);
			mediane(p1, p2, p3, p5, p4);
			mediane(p5, p1, p3, p4, p2);
			mediane(p4, p1, p3, p4, p5);
			mediane(p5, p4, p3, p2, p1);
			mediane(p5, p4, p3, p2, p1);
			mediane(p1, p4, p3, p2, p5);
			mediane(p4, p5, p3, p1, p2);
			mediane(p1, p4, p3, p5, p2);
			mediane(p1, p5, p3, p4, p2);
			mediane(p1, p5, p3, p2, p4);
			mediane(p5, p2, p3, p1, p4);
			mediane(p5, p1, p3, p4, p2);
			mediane(p4, p5, p3, p2, p1);
			mediane(p4, p2, p3, p1, p5);
			mediane(p4, p1, p3, p5, p4);
			mediane(p2, p4, p3, p5, p1);
			mediane(p2, p4, p3, p1, p5);
			mediane(p2, p5, p3, p1, p4);
			mediane(p2, p5, p3, p4, p1);
			mediane(p1, p3, p4, p5, p2);
			mediane(p1, p3, p4, p2, p5);
			mediane(p1, p5, p4, p3, p2);
			mediane(p1, p5, p4, p2, p3);
			mediane(p1, p2, p4, p5, p3);
			mediane(p1, p2, p4, p3, p5);
			mediane(p3, p2, p4, p5, p1);
			mediane(p3, p2, p4, p1, p5);
			mediane(p3, p1, p4, p5, p1);
			mediane(p3, p1, p4, p1, p5);
			mediane(p3, p5, p4, p2, p1);
			mediane(p3, p5, p4, p1, p2);
			mediane(p2, p3, p4, p5, p1);
			mediane(p2, p3, p4, p1, p5);
			mediane(p2, p1, p4, p5, p3);
			mediane(p2, p1, p4, p3, p5);
			mediane(p2, p5, p4, p3, p1);
			mediane(p2, p5, p4, p1, p3);
			mediane(p5, p3, p4, p2, p1);
			mediane(p5, p3, p4, p1, p2);
			mediane(p5, p2, p4, p1, p2);
			mediane(p5, p2, p4, p2, p1);
			mediane(p5, p1, p4, p2, p3);
			mediane(p5, p1, p4, p3, p2);
			
			mediane(p1, p4, p5, p2, p3);
			mediane(p2, p4, p5, p1, p3);
			mediane(p3, p4, p5, p1, p2);
			mediane(p4, p3, p5, p1, p2);
			//etc.
			mediane(p1, p5, p2, p3, p4);
			mediane(p3, p1, p2, p4, p5);
			mediane(p4, p1, p2, p3, p5);
			mediane(p5, p1, p2, p3, p4);
			//etc.
			mediane(p2, p5, p1, p3, p4);			
			mediane(p3, p5, p1, p2, p4);
			mediane(p4, p5, p1, p2, p3);	
		// etc.
		
	}

			// en tout 24*5 possibilités = 120 possibilités!
			

		public static void mediane(int p1, int p2, int p3, int p4, int p5) {
			int p6;
			
			if (p1 < p2)
				if (p2 < p3)
					if (p3 < p4)
						if (p4 < p5)
							p6 = p3;
					else {
					if (p3 > p5)
						if (p5 < p4)
							p6 = p3 ;
					}
			if (p2 < p1)
				if (p1 < p3)
					if (p3 < p4)
						if (p4 < p5)
							p6 = p3;
					else {
					if (p3 > p5)
						if (p5 < p4)
							p6 = p3 ;
					}
			if (p1 < p4)
				if (p4 < p3)
					if (p3 < p5)
						if (p5 < p2)
							p6 = p3;
					else {
					if (p3 < p2)
						if (p2 < p5)
							p6 = p3;
					}
			if (p4 < p1)
				if (p4 < p3)
					if (p3 < p5)
						if (p5 < p2)
							p6 = p3;
					else {
					if (p3 < p2)
						if (p2 < p5)
							p6 = p3;
					}
			if (p1 < p5)
				if (p5 < p3)
					if (p3 < p2)
						if (p2 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p2)
							p6 = p3;
					}
			if (p5 < p1)
				if (p1 < p3)
					if (p3 < p2)
						if (p2 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p2)
							p6 = p3;
					}
			if (p2 < p4)
				if (p4 < p3)
					if (p3 < p1)
						if (p1 < p5)
							p6 = p3;
					else {
					if (p3 < p5)
						if (p5 < p1)
							p6 = p3;
					}
			if (p4 < p2)
				if (p2 < p3)
					if (p3 < p1)
						if (p1 < p5)
							p6 = p3;
					else {
					if (p3 < p5)
						if (p5 < p1)
							p6 = p3;
					}
			if (p5 < p2)
				if (p2 < p3)
					if (p3 < p1)
						if (p1 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p1)
							p6 = p3;
					}
			if (p2 < p5)
				if (p5 < p3)
					if (p3 < p1)
						if (p1 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p1)
							p6 = p3;
					}
			if (p4 < p5)
				if (p5 < p3)
					if (p3 < p1)
						if (p1 < p2)
							p6 = p3;
					else {
					if (p3 < p2)
						if (p2 < p1)
							p6 = p3;
					}
			
			
			
			if (p1 < p2)
				if (p2 < p3)
					if (p3 < p4)
						if (p4 < p5)
							p6 = p3;
					else {
					if (p3 > p5)
						if (p5 < p4)
							p6 = p3 ;
					}
			if (p2 < p1)
				if (p1 < p3)
					if (p3 < p4)
						if (p4 < p5)
							p6 = p3;
					else {
					if (p3 > p5)
						if (p5 < p4)
							p6 = p3 ;
					}
			if (p1 < p4)
				if (p4 < p3)
					if (p3 < p5)
						if (p5 < p2)
							p6 = p3;
					else {
					if (p3 < p2)
						if (p2 < p5)
							p6 = p3;
					}
			if (p4 < p1)
				if (p4 < p3)
					if (p3 < p5)
						if (p5 < p2)
							p6 = p3;
					else {
					if (p3 < p2)
						if (p2 < p5)
							p6 = p3;
					}
			if (p1 < p5)
				if (p5 < p3)
					if (p3 < p2)
						if (p2 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p2)
							p6 = p3;
					}
			if (p5 < p1)
				if (p1 < p3)
					if (p3 < p2)
						if (p2 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p2)
							p6 = p3;
					}
			if (p2 < p4)
				if (p4 < p3)
					if (p3 < p1)
						if (p1 < p5)
							p6 = p3;
					else {
					if (p3 < p5)
						if (p5 < p1)
							p6 = p3;
					}
			if (p4 < p2)
				if (p2 < p3)
					if (p3 < p1)
						if (p1 < p5)
							p6 = p3;
					else {
					if (p3 < p5)
						if (p5 < p1)
							p6 = p3;
					}
			if (p5 < p2)
				if (p2 < p3)
					if (p3 < p1)
						if (p1 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p1)
							p6 = p3;
					}
			if (p2 < p5)
				if (p5 < p3)
					if (p3 < p1)
						if (p1 < p4)
							p6 = p3;
					else {
					if (p3 < p4)
						if (p4 < p1)
							p6 = p3;
					}
					
			
		}}

		