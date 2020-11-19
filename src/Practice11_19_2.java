import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Practice11_19_2 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Random gen = new Random();
		
		int num;
		
		System.out.print("배열의 크기 입력 : ");		num = input.nextInt();
		
		int [] array = new int [num];
		
		for(int i = 0; i < num; i++) {
			array[i] = gen.nextInt(101);
		}
		Arrays.sort(array);
		
		int [] array2 = new int [num];
		
		for(int i = 0; i < num; i++) {
			array2[i] = array[num - i - 1];
		}
		
		System.out.print("배열 내용 : ");
		for(int x : array2) {
			System.out.print(x + " ");
		}
	}

}
