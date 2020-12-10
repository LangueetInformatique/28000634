package atelier11;

import java.awt.Color;

import javax.swing.*;

public class MaPremiereFenetre {
	
	/** Ecrire une classe exécutable créant une fenêtre dont le titre sera votre nom et
	contenant un panneau de la couleur de votre choix. 
	
	Ce panneau contiendra un menu dont le titre sera prénoms et dont les sous-menus seront vos prénoms. **/

	public static void main(String args[]) {
		JFrame Alexane = new JFrame();
		Alexane.setVisible(true);
		Alexane.setBackground(Color.blue);
		JMenu Prenoms = new JMenu();
		Prenoms.setVisible(true);
		JMenuItem p1 = new JMenuItem("Alexane");
		JMenuItem p2 = new JMenuItem("Chengwanli");
		JMenuItem p3 = new JMenuItem("Ana");
		JMenuItem p4 = new JMenuItem("Julien");
		p1.setVisible(true);
		p2.setVisible(true);
		p3.setVisible(true);
		p4.setVisible(true);
		Prenoms.add(p1);
		Prenoms.add(p2);
		Prenoms.add(p3);
		Prenoms.add(p4);
	}
}
