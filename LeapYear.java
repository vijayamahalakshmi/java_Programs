package basiccoding;

public class LeapYear {
	static void LeapYear(int year) {
		if((year%4==0&&year%100!=0)|| (year%400==0)) {
			System.out.println("the given year is a leapyear");
		}
		else {
			System.out.println("The given year is not a leapyear");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int year =2003;
       LeapYear(year);
	}

}
