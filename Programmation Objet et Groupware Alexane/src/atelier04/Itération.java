// L’itération permet un traitement itératif contrôlée par un mécanisme de variables d’itération et de
// critère d’arrêt. 
// Sa syntaxe est : for (<initialisation_s>; <condition>; <mise_s_à _jour>) <blocB>

//Exercice 1 : Ajouter les instructions structurées par une itération permettant d’obtenir dans la
// variable imin l’indice du premier prénom dans l’ordre lexicographique.

package atelier04;

	public class Itération {

		public static void main(String[] args) {

			String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
			int imin = 0;
			int i = 0;
			int n = i +1;


	for (i=0; i < 5 ; i++) 
	{
		int result = prenoms[i].compareTo(prenoms[n]);
		if (result < 0)
		{	
			imin = i;
		}
	}
	System.out.println(imin);
}}