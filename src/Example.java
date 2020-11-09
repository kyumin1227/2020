import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("실적을 입력하시오(단위: 만원)");		x = input.nextInt();		y = 1000;
		if (x >= y) {
			System.out.println("실적 달성");			System.out.println("보너스: " + ((x - y)/10));
		} else {
			System.out.println("실적 미달성");
		}

	}

}
