import java.util.Arrays;
import java.util.Scanner;
class Practice11_11_4 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = {};
		
		int num;
		
		while(true) {
			System.out.print("�߰��� ���� : ");
			num = input.nextInt();
			list = Arrays.copyOf(list, list.length + 1);
			list [list.length - 1] = num;
			
			System.out.print("list ���� : ");
			for (int value : list)
				System.out.print(value + " ");
			System.out.println();
		}
		
	}

}
