import java.util.Scanner;
public class Practice10_14_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int z;
		int x = 0;
		int y = 1;
		
		System.out.print("�� ���� ���ұ��? "); 		z = input.nextInt();
		while (y <= z) {
			x += y;		y++;
		} System.out.println("�հ�: " + x);

	}

}
