import java.util.Scanner;
public class WelcomeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x;
		
		System.out.print("�� �� �ݺ��ұ��?");		x = input.nextInt();
		
		while (i < x) {
			System.out.println((i + 1) +" ȯ���մϴ�."); 		i++;
		}	System.out.println("�ݺ��� ����Ǿ����ϴ�.");

	}

}
