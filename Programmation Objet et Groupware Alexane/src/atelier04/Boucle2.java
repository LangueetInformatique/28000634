//Exercice 2 : Ajouter les instructions structurées par une boucle conditionnelle a priori permettant
// d’obtenir true dans la variable flag si s1 et s2 sont deux mots miroirs, false sinon

// Boucle a priori : while (<condition>) <blocB>;

package atelier04;

public class Boucle2 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length()-1;
		
		char c1, c2; boolean flag = false;
				
		while (i1 != s1.length() && flag == true); 
			
		c1 = s1.charAt(i1); c2 = s2.charAt(i2); 
			if (c1 == c2) {
				flag = true;}
			else {
				flag = false;}
			
			i1++;
			i2--;
			
		System.out.println(flag);	
	}}
