package basiccoding;

public class stringPlaindrome {
	public static Boolean isbool(String str) {
		int begin = 0;
		int end = str.length()-1;
		while(begin < end) {
			if(str.charAt(begin) != str.charAt(end)) {
				return false;
				
			}
			begin++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "level";
		Boolean result = isbool(str);
		System.out.println("ispalindrome:"+result);
		
		

	}

}
