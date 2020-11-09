import java.util.Scanner;
public class Practice2__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("두개의 정수 입력 : ");		x = input.nextInt();		y = input.nextInt();
		if (x > y) {
			z = x;
		} else {
			z = y;
		} System.out.printf("큰 수는 %d 입니다.", z);

	}

}
