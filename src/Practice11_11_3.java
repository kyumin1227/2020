import java.util.Arrays;

public class Practice11_11_3 {
	
	public static void main(String[] args) {
		
		int [] list = { 10, 20, 30, 40, 50 };
		int [] number = list;
		int [] list_copy = Arrays.copyOf(list,  list.length);
		
		list[0] = 0;
		System.out.print("list 내용 : ");
		for (int value : list)
			System.out.print(value + " ");
		System.out.println();
		System.out.print("number 내용 : ");
		for (int value : number) 
			System.out.print(value + " ");
		System.out.println();
		System.out.print("list_copy 내용 : ");
		for (int value : list_copy) 
			System.out.print(value + " ");
		System.out.println();
		int [] make = new int[list.length];
		for (int i = 0; i < list.length; i++) 
			make[i] = list[i];
		System.out.print("make 내용 : ");
		for (int value : make) 
			System.out.print(value + " ");
		
	}

}
