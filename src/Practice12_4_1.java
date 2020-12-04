import java.util.Arrays;
import java.util.Random;
public class Practice12_4_1 {
	public static void main(String [] args) {
		
		
		Random gen = new Random();
		
		int [] array = new int [7];
		int [] num = new int [7];
		
		int num0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		
		System.out.println("#### 주사위 100번 던진 결과 ####");
		
		for (int i = 0; i < 100; i++) {
			num0 = gen.nextInt(6) + 1;
			for (int j = 1; j <= 6; j++) {
				if(num0 == j) {
					array[j] += 1;
					if(num0 == 1) {
						num1 += 1;
					} else if(num0 == 2) {
						num2 += 1;
					} else if(num0 == 3) {
						num3 += 1;
					} else if(num0 == 4) {
						num4 += 1;
					} else if(num0 == 5) {
						num5 += 1;
					} else {
						num6 += 1;
					}
				}
			}
		}
		Arrays.sort(array);
		
		
		for (int i = 6; i >= 1; i--) {
			if (array[i] == num1) {
				if(count1 == 0) {
					System.out.print("1[" + num1 + "] : ");
					count1 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			} if (array[i] == num2) {
				if(count2 == 0) {
					System.out.print("2[" + num2 + "] : ");
					count2 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			} if (array[i] == num3) {
				if (count3 == 0) {
					System.out.print("3[" + num3 + "] : ");
					count3 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			} if (array[i] == num4) {
				if (count4 == 0) {
					System.out.print("4[" + num4 + "] : ");
					count4 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			} if (array[i] == num5) {
				if (count5 == 0) {
					System.out.print("5[" + num5 + "] : ");
					count5 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			} if (array[i] == num6){
				if (count6 == 0) {
					System.out.print("6[" + num6 + "] : ");
					count6 += 1;
					for (int j = 0; j < array[i]; j++) {
						System.out.print("*");
					} System.out.println();
				}
			}
		}
		
		
	}
	
}
