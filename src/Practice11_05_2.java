import java.util.Random;
public class Practice11_05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int x;
		int[] y = new int [46];
		
		System.out.println("=== 로또 번호 생성 ===");
		
		for (int i = 0; i < 6; i++) {
			x = gen.nextInt(45) + 1;
			if (y[x] == 0) {
				++y[x];
				System.out.print((x) + " ");
			} else {
				--i;
			}
		}

	}

}
