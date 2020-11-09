import java.util.Scanner;
public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.print("오늘의 환율을 입력하세요(1달러당 한화금액)");		x = input.nextDouble();
		System.out.print("1번 한화 -> 달러, 2번 달러 -> 한화");			y = input.nextInt();
		if (y == 1) {
			System.out.print("한화를 입력하세요"); 		z = input.nextDouble();		y = Math.round((z / x) * 100);
			System.out.print("환전액은 " + (y / 100) + "입니다.");
		} else if (y == 2) {
			System.out.print("달러를 입력하세요"); 		z = input.nextDouble();		y = Math.round((z * x) * 100);
			System.out.print("환전액은 " + (y / 100) + "입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
