import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] array = new int [10];
		int A, B, C, num, num1 = 10, num2 = 0, num3 = 0;
		
		A = input.nextInt();	B = input.nextInt(); 	C = input.nextInt();
		
		num = A * B * C;
		
		for (int i = 0; i <= (int)Math.log10(num); i++) {
			num2 = (num % num1 - num3) / (num1 / 10);
			for (int ii = 0; ii < array.length; ii++) {
				if (num2 == ii) {
					array[ii] += 1;	break;
				}
			} num3 += (num2 * num1) / 10;	num1 *= 10;
		} for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
