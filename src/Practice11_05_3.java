import java.util.Scanner;
public class Practice11_05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, y, number, count = 0;
		String name;
		String[] names = new String [10];
		int[] numbers = new int [10];
		
		while(true) {
			do {
				System.out.println("===== ���� �ּҷ� �޴� =====");
				System.out.println("  1. ���   2. �˻� \n  3. ���   4. ����");
				System.out.println("===========================");
				System.out.print("�޴� ���� : ");		x = input.nextInt();
			} while(x < 1 || x > 4);
			if (x == 1) {
				System.out.print("����� �̸��� �Է��ϼ��� : ");		names[count] = input.next();		
				System.out.print("����� ��ȭ��ȣ�� �Է��ϼ��� : ");		numbers[count] = input.nextInt();
				count += 1;
			} if (x == 2) {
				System.out.print("�̸����� ã�� = 1, ��ȣ�� ã�� = 2"); 	y = input.nextInt();
				if (y == 1) {
					System.out.print("ã�� �̸��� �Է����ּ��� : ");	name = input.next();
					for (int i = 0; i < names.length; i++) {
						if (name.equals(names[i])) {
							System.out.printf("%s�� %d���� �ֽ��ϴ�.\n", name, i+1);
						}
					}
				} else if (y == 2) {
					System.out.print("ã�� ��ȣ�� �Է����ּ��� : ");	number = input.nextInt();
					for (int i = 0; i < numbers.length; i++) {
						if (number == numbers[i]) {
							System.out.printf("%d�� %d���� �ֽ��ϴ�.\n", number, i+1);
						}
					}
				}
			} if (x == 3) {
				for (int i = 0; i < count; i++) {
					System.out.printf("%d. %s %d\n", i+1, names[i], numbers[i]);
				}
			} if (x == 4) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
		}

	}

}
