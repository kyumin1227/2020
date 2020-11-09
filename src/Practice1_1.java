import java.util.Scanner;
public class Practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("- 정수 입력 : ");			x = input.nextInt();
		y = (x % 10);
		//while (x >= 10) {x -= 10;}
		System.out.printf("- 1자리 숫자는 %d 입니다.", y);

	}

}
