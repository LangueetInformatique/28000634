package atelier11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercice3 {

	/*
	 * Ecrire une classe exécutable créant une fenêtre dont le titre sera D219 contenant
	 * un panneau transparent représentant la plan de la salle D219. 
	 * Choisir la bonne classe de type Layout et positionner à l’emplacement de chaque étudiant 
	 * un composant de type PanneauPrénom.
	 */
	
	public static void main(String args[]) {
		JFrame D219 = new JFrame();
		D219.setVisible(true);
		D219.setBackground(Color.blue);
		JPanel panel219 = new JPanel();
		panel219.setLayout(new FlowLayout());
		panel219.setOpaque(false);
		GridLayout autre = new GridLayout(5, 4);

	
	
	}
}
	
