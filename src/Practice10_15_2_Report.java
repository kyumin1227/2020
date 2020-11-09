import java.util.Random;
public class Practice10_15_2_Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int x;
		
		for (int i = 0; i < 5; i++) {
			x = gen.nextInt(20) + 1;
			System.out.printf("%d: ",x);
			for (int ii = 0; ii < x; ii++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
