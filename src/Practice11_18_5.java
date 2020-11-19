import java.util.Random;
public class Practice11_18_5 {
	public static void main(String [] args) {
		
		Random gen = new Random();
		
		int [][] array = new int [3][5];
		int [] array2 = new int [8];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = gen.nextInt(101);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array2[count] += array[i][j];
			} count += 1;
		}
		
		for(int i = 0; i < array[0].length; i++) {
			for(int j = 0; j < array.length; j++) {
				array2[count] += array[j][i];
			} count += 1;
		}
		
		count = 0;
		for(int i = 0; i < array.length + 1; i++) {
			if (i == 3) {
				while (count < 8) {
					System.out.printf("(%3d)", array2[count]);
					count += 1;
				}
			} else {
				for(int j = 0; j < array[i].length; j++) {
					System.out.printf("%5d", array[i][j]);
				} System.out.printf("  (%d)\n", array2[count]);
				count += 1;
			}
		}
		
	}

}
