import java.util.Scanner;
public class Practice10_14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		double y = 1;
		
		x = input.nextInt();
		
		for(int i = 1; i <= x; i++) {
			y *= i;
		} System.out.printf("%d!�� %.0f �Դϴ�.", x, y);

	}

}
