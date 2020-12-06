
import java.util.*;

public class Test2012042 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] diceAndFreq = new int[6][2];
		int[] freq = new int[6];
		int randomInt;
		
		for (int i = 0; i <  diceAndFreq.length; i++) {
			diceAndFreq[i][0] = i + 1;
		}
		
		System.out.println("#### 주사위 100번 던진 결과 ####");
		for (int i = 0; i < 100; i++) {
			randomInt = rand.nextInt(6);
			diceAndFreq[randomInt][1]++;
			freq[randomInt]++;
		}
		
		
		Arrays.sort(freq);
		
		for (int i = 5; i >= 0; i--){
			for (int j = 0; j < 6; j++) {
				if (diceAndFreq[j][1] == freq[i]) {
					System.out.printf("%d(%d) : ", diceAndFreq[j][0], diceAndFreq[j][1]);
					for (int k = 0; k < diceAndFreq[j][1]; k++)
						System.out.print("★");
					System.out.println();
					
					diceAndFreq[j][1] = 0;
					break;
				}
			}
		}
	}

}