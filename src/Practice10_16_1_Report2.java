import java.util.Random;
public class Practice10_16_1_Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int x;
		
		for(int i = 0; i < 6; i++) {
			x = gen.nextInt(45) + 1;
			System.out.print(x + " ");
		}

	}

}
