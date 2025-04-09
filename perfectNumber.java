package basiccoding;

public class perfectNumber {
	static Boolean perfectnum(int num) {
		/*int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}*/
		int sum =1;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				sum = sum+i;
				if(i!=num/i) {
					sum = sum+num/i;
				}
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		Boolean result = perfectnum(n);
		System.out.println("Is perfect number:"+result);

	}

}
