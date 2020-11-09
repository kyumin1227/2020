import java.util.Scanner;
public class Practice1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("- 실수 입력 : ");		x = input.nextDouble();
		y = (x % 1);		z = y * 10;			
		//while (x >= 1) {x -= 1;}			y = input.
		System.out.printf("- 소수 첫째 자리 숫자는 %d 입니다.", (int)z);

	}

}
