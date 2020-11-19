
public class Practice11_19_1 {
	public static void main (String [] args) {
		
		int [][] array = new int [9][3];
		int x = 2;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				array[i][j] = x * (i + 1);
				x += 1;
				if (x == 5)
					x = 2;
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf(x + " * " + (i + 1) + " = " + "%2d" + " ", array[i][j]);
				x += 1;
				if (x == 5)
					x = 2;
			} System.out.println();
		}
		
	}

}
