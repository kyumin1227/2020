import java.util.Scanner;
public class Practice10_21_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, num1, num2;
		
		
		while (true) {
			do {
				System.out.print("=== 매뉴 ===\n  1. 인사\n  2. 덧셈\n  3. 뺄셈\n  4. 종료\n==========\n원하는 메뉴 : ");		x = input.nextInt();	input.nextLine();
			} while (1 > x || x > 4);
			switch (x) {
			case 1:
				System.out.println("=== 인사 ===");
				System.out.println("안녕하세요.\nJAVA 열심히 자바봅시다.");
				input.nextLine();
				break;
			case 2:
				System.out.println("=== 덧셈 ===");
				System.out.print("두 수를 입력하세요 : ");		num1 = input.nextInt();			num2 = input.nextInt();			input.nextLine();
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				input.nextLine();
				break;
			case 3:
				System.out.println("=== 뺄셈 ===");
				System.out.print("두 수를 입력하세요 : ");		num1 = input.nextInt();			num2 = input.nextInt();			input.nextLine();
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				input.nextLine();
				break;
			case 4:
				System.out.println("=== 종료 ===\n프로그램을 종료합니다.\nBye Bye~~!!");
			} if (x == 4) {
				break;
			}
		}
		

	}

}
