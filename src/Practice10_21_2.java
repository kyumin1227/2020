import java.util.Scanner;
public class Practice10_21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int count;
		
		System.out.print("몇 줄을 출력할까요?");		count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			} for(int ii = 1; ii <= 2 * (count - i - 1) + 1; ii++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
