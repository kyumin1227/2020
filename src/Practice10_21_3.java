import java.util.Scanner;
public class Practice10_21_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, num1, num2;
		
		
		while (true) {
			do {
				System.out.print("=== �Ŵ� ===\n  1. �λ�\n  2. ����\n  3. ����\n  4. ����\n==========\n���ϴ� �޴� : ");		x = input.nextInt();	input.nextLine();
			} while (1 > x || x > 4);
			switch (x) {
			case 1:
				System.out.println("=== �λ� ===");
				System.out.println("�ȳ��ϼ���.\nJAVA ������ �ڹٺ��ô�.");
				input.nextLine();
				break;
			case 2:
				System.out.println("=== ���� ===");
				System.out.print("�� ���� �Է��ϼ��� : ");		num1 = input.nextInt();			num2 = input.nextInt();			input.nextLine();
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				input.nextLine();
				break;
			case 3:
				System.out.println("=== ���� ===");
				System.out.print("�� ���� �Է��ϼ��� : ");		num1 = input.nextInt();			num2 = input.nextInt();			input.nextLine();
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				input.nextLine();
				break;
			case 4:
				System.out.println("=== ���� ===\n���α׷��� �����մϴ�.\nBye Bye~~!!");
			} if (x == 4) {
				break;
			}
		}
		

	}

}
