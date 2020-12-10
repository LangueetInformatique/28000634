package atelier11;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauPrenom extends JPanel {
	
	/* Ecrire la classe non exécutable PanneauPrénom créant le panneau de l’exercice précédent 
	 * (contenant menu et sous-menus). 
	 * Le constructeur (cf. squelette ci-dessous) aura comme paramètres : 
	 * une couleur, un nom sous forme d’une String, les prénoms sous forme 
	 * d’un tableau de String. Ecrire une classe exécutable de test. */
	
		public PanneauPrenom(Color c, String nom, String[] prénoms) {
			
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout());
			JLabel label = new JLabel("Ceci est le nom de mon panneau");
			 

			
		}
}
