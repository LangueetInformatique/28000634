package devoir05;

import atelier08.Aleat;
import atelier08.E421;

public abstract class lancerD�s {
	/*
	Question 2 : Ecrire une méthode lancerDés simulant un lancer de trois dés, avec le nom du
	lanceur en paramètre et renvoyant les trois valeurs dans une instance de la classe TroisDés (à
	écrire). Tester cette méthode
	*/
	public String name;
	public lancerD�s(String name) {
		this.name = name;
	}

	public void getVariable() {
		Aleat a = new Aleat(6);
		int d�1= a.get();
		System.out.println(d�1);
	}
	
	public void getVariable2() {
		Aleat a = new Aleat(6);
		int d�2= a.get();
		System.out.println(d�2);
	}
	
	public void getVariable3() {
		Aleat a = new Aleat(6);
		int d�3= a.get();
		System.out.println(d�3);
	}
	
	public void leverException() throws E421 {
        // ...
        throw new E421(name);
	}

	// On désire traiter le cas où les valeurs 4, 2 et 1 sortent dans l’ordre ou le désordre.
		}
	
