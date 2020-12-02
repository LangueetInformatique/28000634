package atelier08;

public abstract class lancerDés {
	private String name;

	/*
	Question 2 : Ecrire une mÃ©thode lancerDÃ©s simulant un lancer de trois dÃ©s, avec le nom du
	lanceur en paramÃ¨tre et renvoyant les trois valeurs dans une instance de la classe TroisDÃ©s (Ã 
	Ã©crire). Tester cette mÃ©thode
	*/
	public void Lanceur(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
			System.out.println("Jeter les 3 dÃ©s: ");
			Aleat a = new Aleat(6);
			int dé1= a.get();
			int dé2= a.get();
			int dé3= a.get();
			System.out.println(dé1);
			System.out.println(dé2);
			System.out.println(dé3);

			}

	// On dÃ©sire traiter le cas oÃ¹ les valeurs 4, 2 et 1 sortent dans lâ€™ordre ou le dÃ©sordre.
		}
	
