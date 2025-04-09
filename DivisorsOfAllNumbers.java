package basiccoding;

public class DivisorsOfAllNumbers {
	static void Divisors(int n) {
		for(int i=1;i*i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
	        if(i!=n/i) {
	        	System.out.print(n/i+" ");
	        }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		Divisors(n);
        
	}

}
