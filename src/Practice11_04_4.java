import java.util.Scanner;
public class Practice11_04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[]	s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int value, index = -1;
		
		System.out.print("Ž���� ���� �Է��ϼ���: ");		value = input.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == value) {
				index = i;
			}
		} if (index < s.length && index >= 0) {
			System.out.printf("%d���� %d��ġ�� �ֽ��ϴ�.", value, index);
		} else {
			System.out.println("ã���� �ϴ� ���� �����ϴ�.");
		}

	}

}
