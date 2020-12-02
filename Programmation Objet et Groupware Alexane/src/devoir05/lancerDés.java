package devoir05;

import atelier08.Aleat;

public abstract class lancerDés {
	/*
	Question 2 : Ecrire une méthode lancerDés simulant un lancer de trois dés, avec le nom du
	lanceur en paramètre et renvoyant les trois valeurs dans une instance de la classe TroisDés (à
	écrire). Tester cette méthode
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

	// On désire traiter le cas où les valeurs 4, 2 et 1 sortent dans l’ordre ou le désordre.
		}
	
