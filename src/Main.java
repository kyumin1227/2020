import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int [10];
		int count = 0, count2 = 0, count0 = 0, num;
		
		//�� �ޱ�
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int[] array2 = new int[array.length];
		
		//�迭1�� i��° ���� 42�� ����� �迭2�� ����� ���� ���Ͽ� ������ count2 �� ������Ŵ 
		for(int i = 0; i < array.length; i++) {
			num = array[i] % 42;
			for(int ii = 0; ii < array2.length; ii++) {
				if(num == array2[ii]) {
					count2 += 1;
				}
			} 
			//count2�� 0�� ��� ��ġ�� �ʴ´ٰ� �Ǵ��Ͽ� count�� ������Ű�� �迭2�� �ش� ���� �߰�
			if(count2 == 0) {
				array2[count] = num;
				count+=1;
			}
			//0�� ó�� ���� ��� count 1 ����
			if(num == 0 && count0 == 0) {
				count+=1;
				count0+=1;
			}
			count2 = 0;
		}
		
		System.out.println(count);
		
	}

}
