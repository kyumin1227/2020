import java.util.Scanner;
public class Practice2__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("���� �Է� : ");		x = input.nextInt();
		if (x == 1) {
			System.out.printf("%d�� One �Դϴ�.", x);
		} else if (x == 2) {
			System.out.printf("%d�� Two �Դϴ�.", x);
		} else if (x == 3) {
			System.out.printf("%d�� Three �Դϴ�.", x);
		} else if (x == 4) {
			System.out.printf("%d�� Four �Դϴ�.", x);
		} else if (x == 5) {
			System.out.printf("%d�� Five �Դϴ�.", x);
		} else {
			System.out.println("1 ~ 5 ������ ���ڸ� �Է��ϼ���!!!");
		}
			
	}

}
