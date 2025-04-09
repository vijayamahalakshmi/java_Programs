package basiccoding;

public class numberPalindrome {
	public static void main(String args[]) {
	int  N = 121;
	int temp = N;
	int reverse = 0;
	while(N>0) {
		int lastDigit = N%10;
		reverse = (reverse*10)+lastDigit;
		N=N/10;	
	}
	if(temp == reverse) {
		System.out.println("the given number is palindrome");
		}
	else {
		System.out.println("the given number is not a palindrome");
	}
	}

}
