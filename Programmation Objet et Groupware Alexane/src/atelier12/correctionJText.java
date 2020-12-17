package atelier12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class correctionJText {


	public static void main(String[] args) {
		// Declaration de la JFrame
		 JFrame fen = new JFrame("testJTextField"); fen.setSize(280, 280); 
		 JPanel p = new JPanel();
		 fen.getContentPane().add(p);
		 JTextField jtf = new JTextField("Alexane");
		 p.add(jtf);
		 
		 
//			Affichage de la JFrame et de son contenu
		 fen.setVisible(true);

	}

