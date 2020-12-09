package devoir06;

import java.io.File;
import java.io.IOException;

public class TestFileInputStream {
	
	public static void main(String[]args) throws IOException {
		File texte1 = null;
		
		File adelaide = new File("src/atelier09/adelaide.txt");
		
		File texte = FileInputStreamTP7.Copie(adelaide, texte1);
		
		System.out.println(texte);
		
		String encore = FileInputStreamTP7.Propriétés(adelaide);
		
		System.out.println(encore);
	}

}
