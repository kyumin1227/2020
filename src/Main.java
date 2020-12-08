import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, num, count = 0;
		
		n = input.nextInt();
		
		for(int i = 0; i < 10; i++) {
			num = input.nextInt();
			for(int j = 1; j <= 10000; j++) {
				if (n * j == num) {
					System.out.println(num + " is a multiple of " + n + ".");
					count += 1;
				}
			} if (num == 0) {
				
			} else if (count == 0) {
				System.out.println(num + " is NOT a multiple of " + n + ".");
			} count = 0;
		}
	}
}