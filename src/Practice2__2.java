import java.util.Scanner;
public class Practice2__2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("정수 입력 : ");		x = input.nextInt();
		if (x == 1) {
			System.out.printf("%d은 One 입니다.", x);
		} else if (x == 2) {
			System.out.printf("%d는 Two 입니다.", x);
		} else if (x == 3) {
			System.out.printf("%d은 Three 입니다.", x);
		} else if (x == 4) {
			System.out.printf("%d는 Four 입니다.", x);
		} else if (x == 5) {
			System.out.printf("%d는 Five 입니다.", x);
		} else {
			System.out.println("1 ~ 5 사이의 숫자를 입력하세요!!!");
		}
			
	}

}
