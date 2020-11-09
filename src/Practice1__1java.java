import java.util.Scanner;
public class Practice1__1java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x;
		while (true) {
		System.out.print("정수 입력 : ");		x = input.nextInt();
		if (x > 0) {
			System.out.println("정수입니다.");
		} else {
			System.out.println("정수가 아닙니다.");}
		}

	}

}
