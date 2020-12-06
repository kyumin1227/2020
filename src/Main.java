import java.util.Scanner;
	public class Main {
		public static void main (String [] args) {
			
			Scanner input = new Scanner(System.in);
			
			int num = input.nextInt();
			
			int sum = 0;
			
			String mainNum;
			
			char [] array = new char [num];
			
			mainNum = input.next();
			
			for(int i = 0; i < num; i++) {
				array[i] = mainNum.charAt(i);
			}
			for(int i = 0; i < array.length; i++) {
				sum += array[i] - 48;
			} System.out.println(sum);
			
		}
	}