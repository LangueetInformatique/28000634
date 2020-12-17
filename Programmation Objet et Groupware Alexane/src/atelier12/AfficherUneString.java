package atelier12;

import javax.swing.*;
import java.awt.Container;


/**
 * @author montacie
 */
public class AfficherUneString {

	public static void main(String[] args) {
		
		JTextArea ta = new JTextArea("Alexane");
        
		JFrame fen = new JFrame("Essai");
		Container jp = fen.getContentPane();
		jp.add(ta);
		jp.add(new JScrollPane(ta));
		fen.setVisible(true);

	}
}