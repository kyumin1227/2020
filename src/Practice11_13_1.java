import java.util.*;
public class Practice11_13_1 {
	public static void main(String[] args) {
		
		Random gen = new Random();
		
		int [] num_list = new int [25];
		int [] num_list2 = new int [25];
		
		int num, count = 0, count2 = 0;;
		
		//빙고 생성
		for(int i = 0; i < num_list.length; i++) {
			num_list[i] = gen.nextInt(25) + 1;
			for(int ii = 0; ii < i; ii++) {
				if(num_list[i] == num_list[ii]) {
					i--;	break;
				}
			}
			
		} //빙고판 출력
		for (int i = 0; i < num_list.length; i++) {
			if(i % 5 == 0 && i != 0) {
				System.out.println();
 			} if(num_list[i] >= 26)
				System.out.print("*  ");
			else if(num_list[i] >= 10) 
				System.out.print(num_list[i] + " ");
			else
				System.out.print(num_list[i] + "  ");
		} System.out.print("\n");
		while(true) {
		//수 선택
		for(double i = 1; i < 2; i++) {
		num = gen.nextInt(25) + 1;
		num_list2[count2] = num;
			for(int ii = 0; ii < count2; ii++) {
				if (num == num_list2[ii]) {
					i--;	break;
				}
			} for(int ii = 0; ii < num_list.length; ii++) {
				if (num_list2[count2] == num_list[ii]) {
					num_list[ii] = 26;	break;
				}}
		} //선택된 수 출력
		System.out.print("선택된 수 : ");
		for(int i = 0; i < count2 + 1; i++) {
			System.out.print(num_list2[i] + " ");
		} System.out.println();
		//빙고인지 검사
			for(int i = 0; i < 25; i+=5) {
			if (num_list[i] == 26 && num_list[i + 1] == 26 && num_list[i + 2] == 26 && num_list[i + 3] == 26 && num_list[i + 4] == 26)
				count += 1;
		} for(int i = 0; i < 5; i+=1) {
			if (num_list[i] == 26 && num_list[i + 5] == 26 && num_list[i + 10] == 26 && num_list[i + 15] == 26 && num_list[i + 20] == 26)
				count += 1;
		} if (num_list[0] == 26 && num_list[6] == 26 && num_list[12] == 26 && num_list[18] == 26 && num_list[24] == 26)
			count += 1;
		if (num_list[4] == 26 && num_list[8] == 26 && num_list[12] == 26 && num_list[16] == 26 && num_list[20] == 26)
			count += 1;
		if (count >= 3) {
			//빙고판 출력
			System.out.println();
			for (int i = 0; i < num_list.length; i++) {
				if(i % 5 == 0 && i != 0) {
					System.out.println();
				} if(num_list[i] >= 26)
					System.out.print("*  ");
				else if(num_list[i] >= 10) 
					System.out.print(num_list[i] + " ");
				else
					System.out.print(num_list[i] + "  ");
			} //선택된 수 출력
			System.out.print("\n선택된 수 : ");
			for(int i = 0; i < count2 + 1; i++) {
				System.out.print(num_list2[i] + " ");
			} System.out.print(count2 + "번째 빙고!");
			break;
		} //빙고판 출력
		System.out.println();
		for (int i = 0; i < num_list.length; i++) {
			if(i % 5 == 0 && i != 0) {
				System.out.println();
			} if(num_list[i] >= 26)
				System.out.print("*  ");
			else if(num_list[i] >= 10) 
				System.out.print(num_list[i] + " ");
			else
				System.out.print(num_list[i] + "  ");
		};
		count2 += 1;	System.out.println();	count = 0;
		//1초 대기
		try {
			Thread.sleep(1000);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
		}
		
	}

}
