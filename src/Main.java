import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5, count = 0;
		
		num1 = input.nextInt();
		num3 = num1 % 10;	
		num2 = (num1 - num3) / 10;
		while(true) {
			count += 1;
			num4 = num2 + num3;
			if (num4 < 10) {
				num2 = num3 * 10;
				num3 = num4;
			} else {
				num2 = num3 * 10;
				num3 = num4 % 10;
			} num5 = num2 + num3;
			if (num5 == num1) {
				break;
			}
		} System.out.println(count);
	}
}