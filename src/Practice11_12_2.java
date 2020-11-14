
public class Practice11_12_2 {
	public static void main(String[] args) {
		
		boolean prime = true;
		int i;
		
		for (i = 1; i <= 100; i++) {
			prime = true;
			for (int ii = 2; ii < i; ii++) {
				if (i % ii == 0) {
					prime = false;	break;
				}
			} if (prime == true)
				System.out.print(i + " ");
		}
		
	}

}
