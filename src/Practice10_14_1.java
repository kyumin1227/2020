import java.util.Scanner;
public class Practice10_14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y = 1;
		
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");		x = input.nextInt();
		
		while (y < 10) {
			System.out.println(x + " * " + y + " = " + (x * y));		y++;
		}

	}

}
