import java.util.Scanner;
public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("3개의 정수를 입력하세요");		x = input.nextInt();		y = input.nextInt();		z = input.nextInt();
		
		if (x > y) {
			if (x > z) {
				System.out.printf("가장 큰 수는 %d 입니다.", x);
			} else if (x < z) {
				System.out.printf("가장 큰 수는 %d 입니다.", z);
			}
		} else if (x < y) {
			if (y > z) {
				System.out.printf("가장 큰 수는 %d 입니다.", y);
			} else if (y < z) {
				System.out.printf("가장 큰 수는 %d 입니다.", z);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
