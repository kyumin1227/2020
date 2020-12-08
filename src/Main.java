import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y, sum = 0;
		
		x = input.nextInt();
		y = input.nextInt();
		
		switch (x) {
		case 12 :
			sum += 30;
		case 11 :
			sum += 31;
		case 10 :
			sum += 30;
		case 9 :
			sum += 31;
		case 8 :
			sum += 31;
		case 7 :
			sum += 30;
		case 6 :
			sum += 31;
		case 5 :
			sum += 30;
		case 4 :
			sum += 31;
		case 3 :
			sum += 28;
		case 2 :
			sum += 31;
		} sum += y;
		if (sum % 7 == 1) {
			System.out.println("MON");
		} else if (sum % 7 == 2) {
			System.out.println("TUE");
		} else if (sum % 7 == 3) {
			System.out.println("WED");
		} else if (sum % 7 == 4) {
			System.out.println("THU");
		} else if (sum % 7 == 5) {
			System.out.println("FRI");
		} else if (sum % 7 == 6) {
			System.out.println("SAT");
		} else if (sum % 7 == 0) {
			System.out.println("SUN");
		}
			
	}
}