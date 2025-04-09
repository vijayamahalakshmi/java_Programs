package basiccoding;

public class PrimeNumberRange {
	static void primeNumber(int n) {
		if(n<2) {
			System.out.print("There is no prime numbers within this range");
					return ;
		}
		boolean[] isPrime = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			isPrime[i]=true;
		}
		for(int i=2;i*i<=n;i++) {
			for(int j=i*i;j<=n;j+=i) {
				isPrime[j]=false;
			}
		}
		System.out.println("prime numbers up to n:");
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		primeNumber(n);

	}

}
