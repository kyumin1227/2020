
public class Practice11_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ڵ��� �� : " + sum(new int[] {1, 2, 3, 4}));
	}
		
		public static int sum(int[] number) {
			int total = 0;
			for (int i = 0; i < number.length; i++) {
				total += number[i];
		} return total;
		
	}

}
