import java.util.Scanner;
public class Practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("- ���� �Է� : ");			x = input.nextInt();
		y = (x % 10);
		//while (x >= 10) {x -= 10;}
		System.out.printf("- 1�ڸ� ���ڴ� %d �Դϴ�.", y);

	}

}
