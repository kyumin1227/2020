
public class Practice11_19_4 {
	public static void main(String [] args) {
		
		int [] array = new int [1000];
		int [] array2 = new int [1000];
		int count = 0, sum = 0, count2 = 0;
		
		for(int i = 1; i < 1000; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					array[count] = j;
					count += 1;
				}
			}
			for (int j = 0; j < count; j++) {
				sum += array[j];
			} if(i == sum) {
				array2[count2] = i;
				count2 += 1;
			} count = 0;	sum = 0;
		} System.out.print("1000 이하의 완전수는 ");
		for(int i = 0; i < count2; i++) {
			if(i == 0) {
				System.out.print(array2[i]);
			} else {
				System.out.print(", " + array2[i]);
			}
		} System.out.print("입니다.");
		
	}

}
