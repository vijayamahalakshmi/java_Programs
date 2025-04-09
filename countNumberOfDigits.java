package basiccoding;

public class countNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=1878;
		int count =0;
		while(N>0) {
			N=N/10;
			count=count+1;
		}
		System.out.println(count);
		

	}

}
