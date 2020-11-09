import java.util.Scanner;
public class Practice11_05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x, y, number, count = 0;
		String name;
		String[] names = new String [10];
		int[] numbers = new int [10];
		
		while(true) {
			do {
				System.out.println("===== 간단 주소록 메뉴 =====");
				System.out.println("  1. 등록   2. 검색 \n  3. 출력   4. 종료");
				System.out.println("===========================");
				System.out.print("메뉴 선택 : ");		x = input.nextInt();
			} while(x < 1 || x > 4);
			if (x == 1) {
				System.out.print("등록할 이름을 입력하세요 : ");		names[count] = input.next();		
				System.out.print("등록할 전화번호를 입력하세요 : ");		numbers[count] = input.nextInt();
				count += 1;
			} if (x == 2) {
				System.out.print("이름으로 찾기 = 1, 번호로 찾기 = 2"); 	y = input.nextInt();
				if (y == 1) {
					System.out.print("찾을 이름을 입력해주세요 : ");	name = input.next();
					for (int i = 0; i < names.length; i++) {
						if (name.equals(names[i])) {
							System.out.printf("%s는 %d번에 있습니다.\n", name, i+1);
						}
					}
				} else if (y == 2) {
					System.out.print("찾을 번호를 입력해주세요 : ");	number = input.nextInt();
					for (int i = 0; i < numbers.length; i++) {
						if (number == numbers[i]) {
							System.out.printf("%d은 %d번에 있습니다.\n", number, i+1);
						}
					}
				}
			} if (x == 3) {
				for (int i = 0; i < count; i++) {
					System.out.printf("%d. %s %d\n", i+1, names[i], numbers[i]);
				}
			} if (x == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}

	}

}
