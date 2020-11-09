import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5, count = 0;
		
		num1 = input.nextInt();
		num5 = num1;
		while(true) {
			count += 1;
			num3 = num5 % 10;	
			num2 = (num5 - num3) / 10;
			num4 = num2 + num3;
			num2 = num3 * 10;
			num3 = num4 % 10;
			num5 = num2 + num3;
			if (num5 == num1) {
				break;
			}
		} System.out.println(count);
	}
}