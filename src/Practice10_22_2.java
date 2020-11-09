import java.util.*;
public class Practice10_22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int x, y, count = 0, num1 = 0, big = 0, small = 100;
		double z = 0, j;
		
		System.out.print("학생수 입력: ");		x = input.nextInt();
		
		System.out.println("===== 성적 출력 =====");
		
		for(int i = 0; i < x; i++) {
			y = gen.nextInt(60) + 41;
			System.out.print(y + " ");		count += 1;		z += y;
			if (count%5 == 0 && count != 0) {
				System.out.println();
			} if (y >= 60) {
				num1 += 1;
			} if (y >= big) {
				big = y;
			} if (y <= small) {
				small = y;
			}
			
			
		} System.out.println();
		j = z / (double)count;
		System.out.printf("-%d명중 합격인원 : %d\n", count, num1);
		System.out.printf("-최고점 : %d\n",big);
		System.out.printf("-최저점 : %d\n", small);
		System.out.printf("-평균점 : %f", j);

	}

}
