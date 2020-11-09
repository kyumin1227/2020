import java.util.*;
public class Practice10_14_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int x;
		int y = 0;
		
		System.out.print("몇 개의 난수를 생성할까요?");		x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			y += gen.nextInt(100);
		} System.out.printf("%d 개의 난수의 합은 %d 입니다.", x, y);

	}

}
