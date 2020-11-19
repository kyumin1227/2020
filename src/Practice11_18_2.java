import java.util.Scanner;
public class Practice11_18_2 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] [] array = {
				{10, 20, 30, 40},
				{50, 60, 70, 80},
				{90, 100, 110, 120}
		};
		
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {
				System.out.println(r + "За" + c + "ї­:" + array[r][c]);
			}
		}
		
	}

}
