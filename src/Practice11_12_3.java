import java.util.*;
public class Practice11_12_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자 입력");		num = input.nextInt();
		
		for(num = 2; num <= 100; num++) {
			if (verify(num))
				System.out.print(num + " ");
		}
		
		public static boolean verify(int num) {
			boolean prime = true;
			
			for(int i = 2; i < num; i++) {
				if(num%i == 0)
					prime = false;
			}
		}
		
	}

}
