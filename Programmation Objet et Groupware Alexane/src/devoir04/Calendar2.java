package devoir04;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

//Créer la  classe  Calendar2  dérivée  de  Calendar  implémentant 
//attribut cours et trois nouvelles méthodes creation, afficher, duree 
@SuppressWarnings("serial")
public class Calendar2 extends Calendar {
			private boolean cours;
			// attribut cours est de type boolean et contient vrai si l’objet est créé pendant le cours (jeudi 9h30 -12h)
			
			public void creation(Calendar iCalendar) {
				//La méthode creation() affichera la date et l’heure de la création de l’objet
				if(this.get(Calendar.DAY_OF_WEEK)==4 
						&& this.get(Calendar.HOUR_OF_DAY)<12 
						&& (this.get(Calendar.HOUR_OF_DAY)>9
						&& this.get(Calendar.MINUTE)>30)) {
					setCours(true);
				}else {
					setCours(false);
				}
			}
			
			public void afficher(Calendar exCalendar) {
				// la méthode afficher() affiche la date et l’heure courante
				String[] ids = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
				// if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
					System.exit(0);
				
				SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, ids[0]);
				Calendar calendar = new GregorianCalendar(pdt);
				Date trialTime = new Date();
				calendar.setTime(trialTime);
				
				int jour = calendar.get(Calendar.DAY_OF_MONTH);
				int mois = calendar.get(Calendar.MONTH) + 1;
				int annee =  calendar.get(Calendar.YEAR);
				int heure = calendar.get(Calendar.HOUR);
				int minute = calendar.get(Calendar.MINUTE);
				int seconde = calendar.get(Calendar.SECOND);
				System.out.print(jour+"/"+mois+"/"+annee + " ");
				System.out.println(heure+":"+minute+":"+seconde);
				}
			
			public void duree() {
				// la méthode duree() le nombre de secondes depuis la création de l’objet.
				Calendar exCalendar=new GregorianCalendar();
				int NbSecondes=(exCalendar.get(Calendar.HOUR)-this.get(Calendar.HOUR))*60*60+
						(exCalendar.get(Calendar.MINUTE)-this.get(Calendar.MINUTE))*60+
						exCalendar.get(Calendar.SECOND)-this.get(Calendar.SECOND);
				System.out.println(NbSecondes);
			}

			public boolean getCours() {
				return cours;
			}

			public void setCours(boolean cours) {
				this.cours = cours;
			}

			@Override
			public void add(int arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			protected void computeFields() {
				// TODO Auto-generated method stub
				
			}

			@Override
			protected void computeTime() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int getGreatestMinimum(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getLeastMaximum(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getMaximum(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getMinimum(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void roll(int arg0, boolean arg1) {
				// TODO Auto-generated method stub
				
			}
			

}