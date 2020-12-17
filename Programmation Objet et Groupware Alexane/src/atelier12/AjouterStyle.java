package atelier12;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AjouterStyle {

	 public class st1 extends JFrame{

		private static final long serialVersionUID = 1L;

			public st1(){
		    super("Change JTextField Font Name, Style, Size, Color");
		    //Times
		    //Font.italic = font style
		    // 22
		    Font f = new Font("Times",Font.ITALIC,22);
		    JTextField tf = new JTextField("Alexane");
		    //set the font to the JTextField
		    tf.setFont(f);
		    //change a JTextField font color
		    tf.setForeground(Color.blue);
		    add(tf);
		    setLayout(null);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setLocationRelativeTo(null);
		    setSize(400,200);
		    setVisible(true);
		    }
	

}
}
