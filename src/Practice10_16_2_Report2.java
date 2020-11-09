import java.util.Random;
public class Practice10_16_2_Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int x;
		int [] y;
		
		y = new int [6];
		
		for(int i = 0; i < 6; i++) {
			x = gen.nextInt(45) + 1;
			y[i] = x;
			for(int ii = 0; ii < i; ii++) {
				if (x == y[ii]) {
					i -= 1;
				}
			}
		} for(int i = 0; i < 6; i++) {
			System.out.print(y[i] + " ");
		}

	}

}
