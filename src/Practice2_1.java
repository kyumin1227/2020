import java.util.Scanner;
public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("3���� ������ �Է��ϼ���");		x = input.nextInt();		y = input.nextInt();		z = input.nextInt();
		
		if (x > y) {
			if (x > z) {
				System.out.printf("���� ū ���� %d �Դϴ�.", x);
			} else if (x < z) {
				System.out.printf("���� ū ���� %d �Դϴ�.", z);
			}
		} else if (x < y) {
			if (y > z) {
				System.out.printf("���� ū ���� %d �Դϴ�.", y);
			} else if (y < z) {
				System.out.printf("���� ū ���� %d �Դϴ�.", z);
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
