import java.util.*;
public class Practice10_22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int x, y, count = 0;
		
		x = gen.nextInt(100) + 1;
		
		while(true) {
		
		System.out.print("������ �����Ͽ� ���ÿ�: ");		y = input.nextInt();	count += 1;
		
		if (x > y) {
			System.out.println("������ ������ �����ϴ�.");
		} else if (x < y) {
			System.out.println("������ ������ �����ϴ�.");
		} else if (x == y) {
			System.out.printf("�����մϴ�. �õ�Ƚ��=%d", count);		break;
		} 
		}

	}

}
