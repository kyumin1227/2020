
public class Practice11_04_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12, 3, 10, 6, 18, 8, 12, 4, 1, 19};
		
		int x = a[1], y = a[1];		//�ּҰ� = x, �ִ밪 = y
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				x = a[i];
			} if (a[i] > y) {
				y = a[i];
			}
		} System.out.printf("�ּҰ��� %d �ִ밪�� %d �Դϴ�.", x, y);
		

	}

}
