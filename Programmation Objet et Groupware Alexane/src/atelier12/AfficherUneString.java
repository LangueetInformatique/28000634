package atelier12;

import javax.swing.*;
import java.awt.Container;

// les classes abstraites ne peuvent pas s'exécuter. 

public class AfficherUneString {

	public static String Afficher (String a) {
		JTextArea ta = new JTextArea(a);
		JFrame fen = new JFrame("Essai");
		Container jp = fen.getContentPane();
		jp.add(ta);
		jp.add(new JScrollPane(ta));
		fen.setVisible(true);
		return a;

	}
	
}