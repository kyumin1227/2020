import java.util.*;
public class Practice10_14_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int x;
		int y = 0;
		
		System.out.print("�� ���� ������ �����ұ��?");		x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			y += gen.nextInt(100);
		} System.out.printf("%d ���� ������ ���� %d �Դϴ�.", x, y);

	}

}
