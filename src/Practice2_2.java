import java.util.Scanner;
public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("������ ȯ���� �Է��ϼ���(1�޷��� ��ȭ�ݾ�)");		x = input.nextDouble();
		System.out.print("1�� ��ȭ -> �޷�, 2�� �޷� -> ��ȭ");			y = input.nextInt();
		if (y == 1) {
			System.out.print("��ȭ�� �Է��ϼ���"); 		z = input.nextDouble();		y = Math.round((z / x) * 100);
			System.out.print("ȯ������ " + (y / 100) + "�Դϴ�.");
		} else if (y == 2) {
			System.out.print("�޷��� �Է��ϼ���"); 		z = input.nextDouble();		y = Math.round((z * x) * 100);
			System.out.print("ȯ������ " + (y / 100) + "�Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
