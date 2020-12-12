import java.util.Scanner;
public class Main {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int T;
		
		T = input.nextInt();
		
		String [] array = new String [T];
		int [] array3 = new int [T];
		
		for (int i = 0; i < T; i++) {
			array[i] = input.next();
		}
		for (int i = 0; i < T; i++) {
			char [] array2 = new char [array[i].length()];
			for (int j = 0; j < array[i].length(); j++) {
				array2[j] = array[i].charAt(j);
			} for (int j = 0; j < array[i].length() / 2; j++) {
				if (array2[j] == array2[array[i].length() - 1 - j]) {

				} else {
					array3[i] = 1;
				}
			}
		}
		for (int i = 0; i < T; i++) {
			int num1 = 0, num2 = 0, count2 = 0;
			if (array3[i] == 1) {
				char [] array2 = new char [array[i].length()];
				for (int j = 0; j < array[i].length(); j++) {
					array2[j] = array[i].charAt(j);
				} for (int j = 0; j < array[i].length(); j++) {
					int count = 0;
					num1 = 0;
					num2 = 0;
					for (int ii = 0; ii < array[i].length() / 2; ii++) {
						if (ii == j && ii < array[i].length() / 2) {
							num1 = 1;
							num2 = 0;
						} else if (ii == array[i].length() - j - 1 && j > array[i].length() / 2) {
							num1 = 0;
							num2 = 1;
						} if (array2[ii + num1] == array2[array[i].length() - ii - 1 - num2]) {
							
						} else {
							count += 1;
						}
					}
					if (count < 1) {
						count2 += 1;
					}
				}
				if (count2 >= 1) {
					array3[i] = 1;
				} else {
					array3[i] = 2;
				}
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println(array3[i]);
		}
	}
}