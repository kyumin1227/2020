import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("������ �Է��Ͻÿ�(����: ����)");		x = input.nextInt();		y = 1000;
		if (x >= y) {
			System.out.println("���� �޼�");			System.out.println("���ʽ�: " + ((x - y)/10));
		} else {
			System.out.println("���� �̴޼�");
		}

	}

}
