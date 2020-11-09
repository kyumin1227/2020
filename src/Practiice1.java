import java.util.Scanner;
public class Practiice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		
		while (true) {
		System.out.print("숫자를 입력하세요"); 		x = input.nextInt();
		if (x > 0) {
			if ((x % 2) == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");}
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}

	}

}
