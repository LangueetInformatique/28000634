// L’objectif de cette partie est de créer votre première arborescence de classes. Soit une
// classe abstraite Animal, avec 2 attributs, 1 constructeur et 2 méthodes

// Exercice 1: Compléter le code de la classe Félin. Ecrire une classe de test.

package atelier06;

public static void main(String[] args) {
	str ;

public class Dérivé01 {
	
	/** Création et gestion d'animaux */
	public abstract class Animal{
	private String espèce;
	private int nb_pattes = 0;
	private String cri;
	
	/** création d'une nouvelle instance de la classe Animal
	* @param type nom de l'espèce
	* @param pattes nombre de pattes
	*/
	
	public Animal(String type, int pattes) {
	espèce=type;
	nb_pattes = pattes;
	}
	/** présentation des caractéristiques de l'animal */
	public void présente() {
	System.out.println("je suis un représentant de l'espèce des " +espèce+
	" et j'ai "+nb_pattes+ " pattes" );
	}
	
	/** cri de l'animal 
	 * @return */
	abstract public void crie(String types){
	cri = types;
	}
	
	public void présente1() {
	System.out.println("je suis un représentant de l'espèce des " + espèce + " et mon cri est "+ cri);
	}}}}
