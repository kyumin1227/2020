import java.util.Scanner;
public class Practice11_18_4 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		char[][] board = new char[3][3];
		int x, y;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
				System.out.print(" ");
			}
		}
		
		do {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " ");
				} System.out.println();
			}
		System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
		x = input.nextInt();
		y = input.nextInt();
			
		if(board[x][y] != ' ') {
			System.out.println("�߸��� ��ġ�Դϴ�. ");
			continue;
		} else {
			board[x][y] = 'x';
		}
		
		int i = 0, j = 0;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++)
				if (board[i][j] == ' ')
					break;
		if (board[i][j] == ' ')
			break;
		}
		if(i < 3 && j < 3)
			board[i][j] = 'O';
		} while(true);
		
	}

}
