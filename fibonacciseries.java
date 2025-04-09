package basiccoding;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0,b=1;
		int n = 10;
		int nextTerm;
		System.out.print(a+ " "+b + " ");
		for(int i=2;i<n;i++) {
			nextTerm = a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm + " ");
		}

	}

}
