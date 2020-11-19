import java.util.Scanner;
public class Practice11_19_5 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3 = 0, count1 = 0, count2 = 0;
		
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		int [] array1 = new int [num1];
		int [] array2 = new int [num2];
		
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				array1[count1] = i;
				count1 += 1;
			}
		} for(int i = 1; i <= num2; i++) {
			if(num2 % i == 0) {
				array2[count2] = i;
				count2 += 1;
			}
		} for(int i = 0; i < count1; i++) {
			for(int j = 0; j < count2; j++) {
				if(array1[i] == array2[j]) {
					num3 = array1[i];
				}
			}
		} System.out.printf("%d와 %d의 최대공약수는 %d입니다.", num1, num2, num3);
		
	}

}
