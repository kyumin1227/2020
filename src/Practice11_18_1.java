import java.util.*;
public class Practice11_18_1 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		
		int num1, num2, count1 = 0, count2 = 0;
		
		while(true) {
		do {
			System.out.print("����� ����[1:����, 2:����, 3:��]: ");
			num1 = input.nextInt();
		} while(num1 > 3 || num1 < 1);
		num2 = gen.nextInt(3) + 1;
		
		System.out.printf("�� : %d", num2);
		System.out.printf("\n����� : %d\n", num1);
		
		if(num1 + 1 == num2 || (num1 == 3 && num2 == 1)) {
			System.out.println("��ǻ�� �¸�!!");
			count1 += 1;
		} else if(num2 + 1 == num1 || (num2 == 3 && num1 == 1)) {
			System.out.println("����� �¸�!!");
			count2 += 1;
		} else
			System.out.println("�����ϴ�!");
		if(count1 == 3) {
			System.out.printf("���ھ� : [��] %d : %d [�����]", count1, count2);
			System.out.println("--- ��ǻ�� �¸��� ���α׷��� �����մϴ�. ---");
			break;
		} else if(count2 == 3) {
			System.out.printf("���ھ� : [��] %d : %d [�����]", count1, count2);
			System.out.println("--- ����� �¸��� ���α׷��� �����մϴ�. ---");
			break;
		}
		
		}
		
	}

}
