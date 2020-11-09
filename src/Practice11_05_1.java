import java.util.Scanner;
public class Practice11_05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int[] seat = new int[10];
		
		while(true) {
			do {
			System.out.println("----------------------------------");
			System.out.println("  1  2  3  4  5  6  7  8  9  10 ");
			System.out.println("----------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print("  " + seat[i]);
			} System.out.print("\n원하시는 좌석의 번호를 입력하세요(종료는 -1):");	x = input.nextInt() - 1;
			} while(x < -2 || x > 9);
			if (x == -2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} if (x == -1) {
				System.out.println("없는 좌석입니다.");
			} else if (seat[x] == 0) {
				System.out.println("예약되었습니다"); seat[x]++;
			} else if (seat[x] == 1) {
				System.out.println("이미 예약된 자리입니다.");
			} 
		}
	}

}
