package basiccoding;
import java.util.*;

public class GCD {
	public static void main(String args[]) {
		int a=52,b=10;
		while(a>0&&b>0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		if(a==0) {
			System.out.print(b);
		}
		else {
			System.out.print(a);
		}
	}
		
		
	}

