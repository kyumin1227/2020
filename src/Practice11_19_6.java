import java.util.Scanner;
import java.util.Random;
public class Practice11_19_6 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int num, sum1 = 0, sum2 = 0;
		double sum3;
		
		System.out.print("���ϴ� ���� ���� �Է� : ");
		num = input.nextInt();
		
		int [] array = new int [num];
		
		System.out.print("�迭�� ���� :");
		
		for(int i = 0; i < num; i++) {
			array[i] = gen.nextInt(101);
			System.out.print(" " + array[i]);
		}
		
		for(int i = 0; i < num; i++) {
			if(array[i] % 2 == 0) {
				sum1 += array[i];
			} else {
				sum2 += array[i];
			}
		}
		System.out.printf("\nȦ���� �� : %d", sum2);
		System.out.printf("\n¦���� �� : %d", sum1);
		
		sum3 = (sum1 + sum2) / (double)num;
		
		System.out.printf("\n��� : %.2f", sum3);
		
	}

}
