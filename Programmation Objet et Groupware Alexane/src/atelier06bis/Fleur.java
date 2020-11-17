package atelier06bis;

public class Fleur extends Vegetal implements Terre {

	public Fleur(String name) {
		super(name);
	}

	@Override
	public void colour() {
		System.out.println("Les fleurs sont tantôt jaune, rose, blanche, ou orange.");
	}

	@Override
	public int getSize() {
		return 1; // les fleurs sont petites, on leur donne une valeur de 1
	}

	@Override
	public boolean hasBranch() {
		return false; // les fleurs n'ont pas de branches
	}

	@Override
	public boolean PousseEnTerre() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "lisse ou picant";
	}
	
	public boolean hasSmell() {
		return true;
	}
	
	public String getSmell() {
		return "Les fleurs ont une odeur tantôt douce et agréable tantôt forte et irritante.";
	}

}
