package basiccoding;

public class PrimeFactors {
	
    static Boolean isPrime(int n) {
    	if(n<2) {
    		return false;
    	}
    	if(n==2 || n==3) {
    		return true;
    	}
    	if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
    	for(int i=5;i*i<=n;i+=6) {
    		if(n%i==0 || n%(i+2)==0) {
    			return false;
    		}
    	}
    	return true;
    }
    /*static void primeFactors(int num) {
    	for(int i=2;i<num;i++) {
    		if(isPrime(i)) {
    			int x=i;
    			while(num%x==0) {
    				System.out.print(i+" ");
    				x=x*i;
    			}
    		}
    	}
    }*/
    static void primeFactors(int n) {
    	if(n<=1) {
    		return ;
    	}
    	for(int i=2;i*i <=n;i++) {
    		while(n%i==0) {
    			System.out.print(i+" ");
    			n=n/i;
    		}
    	}
    	if(n>1) {
    		
    		System.out.print(n);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1092;
		primeFactors(num);

	}

}
