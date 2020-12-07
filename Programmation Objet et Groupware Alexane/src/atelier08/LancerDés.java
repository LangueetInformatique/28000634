package atelier08;

public abstract class LancerDés {
	private String name;

	/*
	Question 2 : Ecrire une méthode lancerDés simulant un lancer de trois dés, avec le nom du
	lanceur en paramètre et renvoyant les trois valeurs dans une instance de la classe TroisDés (à
	écrire). Tester cette méthode
	*/
	public void Lanceur(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
			System.out.println("Jeter les 3 dés: ");
			Aleat a = new Aleat(6);
			int dé1= a.get();
			int dé2= a.get();
			int dé3= a.get();
			System.out.println(dé1);
			System.out.println(dé2);
			System.out.println(dé3);

			}

	// On désire traiter le cas où les valeurs 4, 2 et 1 sortent dans l’ordre ou le désordre.
		}