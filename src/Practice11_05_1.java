import java.util.Scanner;
public class Practice11_05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int[] seat = new int[10];
		
		while(true) {
			do {
			System.out.println("----------------------------------");
			System.out.println("  1  2  3  4  5  6  7  8  9  10 ");
			System.out.println("----------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print("  " + seat[i]);
			} System.out.print("\n���Ͻô� �¼��� ��ȣ�� �Է��ϼ���(����� -1):");	x = input.nextInt() - 1;
			} while(x < -2 || x > 9);
			if (x == -2) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} if (x == -1) {
				System.out.println("���� �¼��Դϴ�.");
			} else if (seat[x] == 0) {
				System.out.println("����Ǿ����ϴ�"); seat[x]++;
			} else if (seat[x] == 1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			} 
		}
	}

}
