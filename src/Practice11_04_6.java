import java.util.Random;
public class Practice11_04_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		
		int[] s = new int[6];
		int x = 0;
		
		for (int i = 0; i < 100; i++) {
			x = gen.nextInt(6);
			++s[x];
		} System.out.println("===== 주사위 빈도 별그래프 =====");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d : ", i + 1);
			for (int ii = 0; ii < s[i]; ii++) {
				System.out.print("*");
			} System.out.println();
		}

	}

}
