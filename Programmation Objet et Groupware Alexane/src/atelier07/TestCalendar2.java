package atelier07;

public class TestCalendar2 {
	
		public static void main(String[] args) {
			Calendar2 exemple = new Calendar2();
			
			System.out.println(exemple.getCours());		
			
			exemple.duree();
			exemple.creation(exemple);
			exemple.afficher(exemple);

		}

	}
