import java.util.Arrays;
import java.util.Random;
public class Practice11_11_7 {
	public static void main(String [] args) {
		
		Random gen = new Random();
		
		int [] nums = new int [10];
		int num1, num2, num3;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = gen.nextInt(100) + 1;
		} System.out.print("기본 리스트 : ");
		for (int num : nums)
			System.out.print(num + " ");
		Arrays.sort(nums);
		System.out.print("\n정렬된 리스트 : ");
		for (int num : nums)
			System.out.print(num + " ");
		for (int i = 0; i < 100; i++) {
			num1 = gen.nextInt(nums.length);
			num2 = gen.nextInt(nums.length);
			
			num3 = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = num3;
		}
		System.out.print("\n믹스된 리스트 : ");
		for (int num : nums)
			System.out.print(num + " ");
		
	}

}
