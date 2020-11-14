import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int [10];
		int count = 0, count2 = 0, count0 = 0, num;
		
		//수 받기
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int[] array2 = new int[array.length];
		
		//배열1의 i번째 값을 42로 나누어서 배열2에 저장된 값과 비교하여 같으면 count2 를 증가시킴 
		for(int i = 0; i < array.length; i++) {
			num = array[i] % 42;
			for(int ii = 0; ii < array2.length; ii++) {
				if(num == array2[ii]) {
					count2 += 1;
				}
			} 
			//count2가 0일 경우 겹치지 않는다고 판단하여 count를 증가시키고 배열2에 해당 값을 추가
			if(count2 == 0) {
				array2[count] = num;
				count+=1;
			}
			//0이 처음 나올 경우 count 1 증가
			if(num == 0 && count0 == 0) {
				count+=1;
				count0+=1;
			}
			count2 = 0;
		}
		
		System.out.println(count);
		
	}

}
