import java.util.Scanner;
public class WelcomeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int x;
		
		System.out.print("몇 번 반복할까요?");		x = input.nextInt();
		
		while (i < x) {
			System.out.println((i + 1) +" 환영합니다."); 		i++;
		}	System.out.println("반복이 종료되었습니다.");

	}

}
