import java.util.Scanner;
public class Practice10_14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y = 1;
		
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");		x = input.nextInt();
		
		while (y < 10) {
			System.out.println(x + " * " + y + " = " + (x * y));		y++;
		}

	}

}
