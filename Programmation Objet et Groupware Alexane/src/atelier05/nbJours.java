package atelier05;

import cours04.Date;
import java.text.SimpleDateFormat;

public class nbJours {
	
	public static void main(String[] args) {
		Date df = new Date(14,7,2021);
		     try {
		        Date dateAvant = df.parse("22,10,2020");
		       Date dateApres = df.parse("14,7,2021");
		       long diff = dateApres.getTime() - dateAvant.getTime();
		       float res = (diff / (1000*60*60*24));
		       System.out.println("Nombre de jours entre les deux dates est: "+res);
		     } catch (Exception e) {
		         e.printStackTrace();
		     }
		   }

}
