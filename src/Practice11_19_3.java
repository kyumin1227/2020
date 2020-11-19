import java.util.*;
public class Practice11_19_3 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] array = new int [100];
		int num, count = 0, sum = 0;
		
		num = input.nextInt();
		
		for(int i = 1; i < num; i++) {
			if (num % i == 0) {
				array[count] = i;
				count += 1;
			}
		} System.out.printf("%d의 약수는 ", num);
		
		for(int i = 0; i < 100; i++) {
			if(array[i] == 0)
				break;
			if(array[i] == 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(", " + array[i]);
			}
			sum += array[i];
		}
		System.out.printf("이며 합은 %d입니다.", sum);
		
		
	}

}
