import java.util.Scanner;
public class Practice11_04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] grade = {10, 20, 30, 40, 50};
		//int[] grade = new int [5];
		
		int i, x = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.print("������ �Է��Ͻÿ�:");		grade[i] = input.nextInt();
			x += grade[i];
			} System.out.printf("��� ������ %.2f �Դϴ�.", x / 5.0);

	}

}
