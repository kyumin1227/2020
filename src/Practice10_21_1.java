import java.util.Scanner;
public class Practice10_21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int count;
		
		System.out.println("몇 줄을 출력할까요?");		count = input.nextInt();
		
		for(int j = 1; j <= count; j++) {
			for(int ii = 1; ii < j; ii++) {
				System.out.print("  ");
			}
			for(int i = 0; i <= count - j; i++) {
				System.out.print("*" + " ");
			} System.out.println();
		}

	}

}
