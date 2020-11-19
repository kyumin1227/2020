import java.util.Scanner;
public class Practice11_18_3 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int array[][] = new int [3][3];
		int num1, num2;
		
		//출력
		for(int i = 0; i < array.length; i++) {
			for(int z = 0; z < array[i].length; z++) {
				if(array[i][z] == 0)
					System.out.print("  ");
				if(array[i][z] == 1)
					System.out.print("O ");
				if(array[i][z] == 2)
					System.out.print("X ");
			} System.out.println();
		}
		do {
			System.out.print("다음 수의 좌표를 입력하시오: ");
			num1 = input.nextInt();
			num2 = input.nextInt();
		} while((num1 > 3 && num2 > 3) || (num1 < 1 && num2 < 1));
		
		if(array[num1][num2] == 0)
			array[num1][num2] = 2;
		
		for(int i = 0; i < array.length; i++) {
			for(int z = 0; z < array[i].length; z++) {
				if(array[i][z] == 0) {
					array[i][z] = 1;
				}
			}
		}
		
	}

}
