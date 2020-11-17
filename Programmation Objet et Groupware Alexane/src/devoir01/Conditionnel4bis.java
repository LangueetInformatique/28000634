package devoir01;

public class Conditionnel4bis {
	
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;

		int k = 0;
		int j = 0;
		int i = 0;
		mediane(i, j, k);
		mediane(j, k, i);
		mediane(k, i, j);
		mediane(i, k, j);
		mediane(k, j, i);
		mediane(j, i, k);
	}


	private static void mediane(int k, int i, int j) {
		// TODO Auto-generated method stub
		
	}


	public static int mediane(int p1, int p2, int p3, int p4, int p5) {
		int p6;

		int i = 0;
		int k = 0;
		int j = 0;
		if (i > j) {
			if (k > i)
				p6 = i;
			else {
				if (k > j)
					p6 = k;
				else
					p6 = j;
			}
		} else {
			if (k > j)
				p6 = j;
			else {
				if (k > i)
					p6 = k;
				else
					p6 = i;
			}
		}

		System.out.print(p6);

		return p6;
	}

}
