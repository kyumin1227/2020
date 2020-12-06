import java.util.Scanner;
public class Test {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch = input.nextLine().charAt(0);
		int num = (int)ch;
		
		System.out.println(num);
		
	}
}