import java.util.*;
public class Practice11_18_1 {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		
		int num1, num2, count1 = 0, count2 = 0;
		
		while(true) {
		do {
			System.out.print("사용자 선택[1:가위, 2:바위, 3:보]: ");
			num1 = input.nextInt();
		} while(num1 > 3 || num1 < 1);
		num2 = gen.nextInt(3) + 1;
		
		System.out.printf("컴 : %d", num2);
		System.out.printf("\n사용자 : %d\n", num1);
		
		if(num1 + 1 == num2 || (num1 == 3 && num2 == 1)) {
			System.out.println("컴퓨터 승리!!");
			count1 += 1;
		} else if(num2 + 1 == num1 || (num2 == 3 && num1 == 1)) {
			System.out.println("사용자 승리!!");
			count2 += 1;
		} else
			System.out.println("비겼습니다!");
		if(count1 == 3) {
			System.out.printf("스코어 : [컴] %d : %d [사용자]", count1, count2);
			System.out.println("--- 컴퓨터 승리로 프로그램을 종료합니다. ---");
			break;
		} else if(count2 == 3) {
			System.out.printf("스코어 : [컴] %d : %d [사용자]", count1, count2);
			System.out.println("--- 사용자 승리로 프로그램을 종료합니다. ---");
			break;
		}
		
		}
		
	}

}
