package devoir03;

public abstract class Vegetal {
	
	public String name;
	public Vegetal(String name) {
		this.name = name;
	}
	public abstract void colour();
	
	public abstract int getSize();
	
	public abstract boolean hasBranch();
	
	public void oxygene() {
		System.out.println("Les végétaux produisent de l'oxygène");
	}
	
	public String getName() {
		return name;
	}

}
