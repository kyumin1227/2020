import java.util.Scanner;
public class Practiice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		while (true) {
		System.out.print("���ڸ� �Է��ϼ���"); 		x = input.nextInt();
		if (x > 0) {
			if ((x % 2) == 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");}
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}

	}

}
