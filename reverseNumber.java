package basiccoding;

public class reverseNumber {
public static void main(String args[]) {
	int N=186;
	int reverse_num=0;
	while(N>0) {
		int lastDigit = N%10;
		reverse_num = (reverse_num*10)+lastDigit;
        N = N/10;
	}
	System.out.println("the reversed number is :"+reverse_num);
}
}
