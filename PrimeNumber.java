package basiccoding;

public class PrimeNumber {
	static Boolean isprime(int n) {
		/*for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;*/
		/*if(n==1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}*/
		if(n<2) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
      Boolean result = isprime(n);
      System.out.println(result);
      	}

}
