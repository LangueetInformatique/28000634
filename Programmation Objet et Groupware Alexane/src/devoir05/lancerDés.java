package devoir05;

import atelier08.Aleat;
import atelier08.E421;

public abstract class lancerDés {
	/*
	Question 2 : Ecrire une mÃ©thode lancerDÃ©s simulant un lancer de trois dÃ©s, avec le nom du
	lanceur en paramÃ¨tre et renvoyant les trois valeurs dans une instance de la classe TroisDÃ©s (Ã 
	Ã©crire). Tester cette mÃ©thode
	*/
	public String name;
	public lancerDés(String name) {
		this.name = name;
	}

	public void getVariable() {
		Aleat a = new Aleat(6);
		int dé1= a.get();
		System.out.println(dé1);
	}
	
	public void getVariable2() {
		Aleat a = new Aleat(6);
		int dé2= a.get();
		System.out.println(dé2);
	}
	
	public void getVariable3() {
		Aleat a = new Aleat(6);
		int dé3= a.get();
		System.out.println(dé3);
	}
	
	public void leverException() throws E421 {
        // ...
        throw new E421(name);
	}

	// On dÃ©sire traiter le cas oÃ¹ les valeurs 4, 2 et 1 sortent dans lâ€™ordre ou le dÃ©sordre.
		}
	
