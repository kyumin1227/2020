
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2400;
		boolean isLeapYear;
		
		isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
		System.out.println(year + "≥‚¿Ã ¿±≥‚? " + isLeapYear);

	}

}
