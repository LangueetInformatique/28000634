package atelier08;

public class lancerDés {
	/*
	Question 2 : Ecrire une méthode lancerDés simulant un lancer de trois dés, avec le nom du
	lanceur en paramètre et renvoyant les trois valeurs dans une instance de la classe TroisDés (à
	écrire). Tester cette méthode.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Jetter les 3 dés: ");
			Aleat a = new Aleat(6);
			int dé1= a.get();
			int dé2= a.get();
			int dé3= a.get();
			System.out.println(dé1);
			System.out.println(dé2);
			System.out.println(dé3);

			}

		}

