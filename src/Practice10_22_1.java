import java.util.*;
public class Practice10_22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int x, y, count = 0;
		
		x = gen.nextInt(100) + 1;
		
		while(true) {
		
		System.out.print("정답을 추측하여 보시오: ");		y = input.nextInt();	count += 1;
		
		if (x > y) {
			System.out.println("제시한 정수가 낮습니다.");
		} else if (x < y) {
			System.out.println("제시한 정수가 높습니다.");
		} else if (x == y) {
			System.out.printf("축하합니다. 시도횟수=%d", count);		break;
		} 
		}

	}

}
