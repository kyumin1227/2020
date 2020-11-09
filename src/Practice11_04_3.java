
public class Practice11_04_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12, 3, 10, 6, 18, 8, 12, 4, 1, 19};
		
		int x = a[1], y = a[1];		//최소값 = x, 최대값 = y
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				x = a[i];
			} if (a[i] > y) {
				y = a[i];
			}
		} System.out.printf("최소값은 %d 최대값은 %d 입니다.", x, y);
		

	}

}
