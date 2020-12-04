import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int array [] = new int [10001];
		
		int n;
		
		for(n = 0; n < 10000; n++) {
			for(int i = 0; i < array.length; i++) {
				if(d(n) == i) {
					array[i] = 1;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
	static int d(int n) {
		int num0, num1, num2, num3, num4;
		
		num0 = n % 10;
		num1 = n % 100 - num0;
		num2 = n % 1000 - num0 - num1;
		num3 = n % 10000 - num0 - num1 - num2;
		
		num4 = n + num0 + (num1 / 10) + (num2 / 100) + (num3 / 1000);
		
		return num4;
	}

}