import java.util.Scanner;
public class Practice10_14_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, y, r;
		
		System.out.print("�� ���� ������ �Է��Ͻÿ� (ū��, ������)");		x = input.nextInt();		y = input.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		} System.out.println("�ִ� ������� " + x);
		
	}

}
