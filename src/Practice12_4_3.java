import java.util.Arrays;
import java.util.Random;
public class Practice12_4_3 {
	public static void main (String [] args) {
		
		
		Random gen = new Random();
		
		int array [] = new int [6];
		int num [] = new int [6];
		int count [] = new int [6];
		int num0;
		
		System.out.println("#### 주사위 100번 던진 결과 ####");
		
		for (int i = 0; i < 100; i++) {
			num0 = gen.nextInt(6);
			for (int j = 0; j < array.length; j++) {
				if (num0 == j) {
					array[j] += 1;
					num[j] += 1;
				}
			}
		} Arrays.sort(array);
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= 5; j++) {
				if (array[i] == num[j] && count[j] == 0) {
					System.out.printf("%d[%d] : ",j + 1 , array[i]);
					count[j] += 1;
					for (int ii = 0; ii < array[i]; ii++) {
						System.out.print("★");
						continue;
					} System.out.println();
				}
			}
		}
		
	}
	
}
