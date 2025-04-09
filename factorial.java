package basiccoding;

public class factorial {
        static int  factorialOfNumber(int n) {
        	/*nt result=1;
        	for(int i=2;i<=n;i++) {
        		result = result*i;
        	}
        	System.out.println(result);*/
        	if(n==0) {
        		return 1;
        	}
        	return n*factorialOfNumber(n-1);
        	
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int result =factorialOfNumber(num);
		System.out.print(result);

	}

}
