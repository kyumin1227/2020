import java.util.Scanner;
public class Practice2__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("�ΰ��� ���� �Է� : ");		x = input.nextInt();		y = input.nextInt();
		if (x > y) {
			z = x;
		} else {
			z = y;
		} System.out.printf("ū ���� %d �Դϴ�.", z);

	}

}
