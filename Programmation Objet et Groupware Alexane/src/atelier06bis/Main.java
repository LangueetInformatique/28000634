package atelier06bis;

public class Main {
	
	public static void main(String[] args) {
		
		Arbre a = new Arbre("Bouleau");
		a.colour();
		a.oxygene();
		
		
		Fleur f = new Fleur("Pissenlit");
		f.colour();
		f.oxygene();
		
		Arbre b = new Arbre("Peuplier");
		b.colour();
		b.getSize();
		b.getSkinType();
		b.getSmell();
		
		if(!(a instanceof Terre)) {
			System.out.println("Ce végétal n'implémente pas l'interface Terre");
		}
		// super permet d'accéder à la superclasse
	}
}
