import java.util.Scanner;
public class Practice10_14_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("올바른 월을 입력하시오 [1 - 12]: ");		x = input.nextInt();
		} while(x > 12 || x < 1);
		System.out.println("사용자가 입력한 월은 " + x);

	}

}
