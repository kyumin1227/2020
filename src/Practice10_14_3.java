import java.util.Scanner;
public class Practice10_14_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1 - 12]: ");		x = input.nextInt();
		} while(x > 12 || x < 1);
		System.out.println("����ڰ� �Է��� ���� " + x);

	}

}
