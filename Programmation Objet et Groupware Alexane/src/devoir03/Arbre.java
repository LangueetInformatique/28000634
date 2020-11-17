package devoir03;

public class Arbre extends Vegetal implements Terre {

	public Arbre(String name) {
		super(name);
	}

	public void colour() {
		System.out.println("marron, et vert");
	}

	@Override
	public int getSize() {
		return 3; // les arbres sont grands, on leur donne une valeur de 3
	}

	@Override
	public boolean hasBranch() {
		return true;
	}

	@Override
	public boolean PousseEnTerre() {
		return false;
	}

	@Override
	public String getSkinType() {
		return "rugueux et dur";
	}
	
	public boolean hasSmell() {
		return false;
	}
	
	public String getSmell() {
		return "Les arbres n'ont pas d'odeur";
	}

}
