package atelier11;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class PanneauPrenom extends JPanel {
	
	/* Ecrire la classe non exécutable PanneauPrénom créant le panneau de l’exercice précédent 
	 * (contenant menu et sous-menus). 
	 * Le constructeur (cf. squelette ci-dessous) aura comme paramètres : 
	 * une couleur, un nom sous forme d’une String, les prénoms sous forme 
	 * d’un tableau de String. Ecrire une classe exécutable de test. */
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public PanneauPrenom(Color c, String nom, String[] prenoms) {
			
			setBackground(Color.BLUE);
			
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout());
			
			this.setBackground(c);
			JMenuBar mb = new JMenuBar();
			this.add(mb);
			JMenu m = new JMenu("prenoms");
			mb.add(m);
			for (int i = 0;i < prenoms.length;i++)
				m.add(prenoms[i]);	
			
		}
}
