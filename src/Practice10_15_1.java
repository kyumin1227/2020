import java.util.*;
public class Practice10_15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int x;
		int y = 0;
		double z = 0;
		
		for (int i = 1; i <= 25; i++) {
			x = gen.nextInt(41) + 60;
			y += x;		z = ((double)y / 25.0);
			System.out.print(x + " ");
			if (i % 5 == 0) {
				System.out.println();
			}
		} System.out.printf("ÇÕ°è : %d Æò±Õ : %.2f", y, z);

	}

}
