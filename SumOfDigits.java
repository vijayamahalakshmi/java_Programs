package basiccoding;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  num= 23456;
		 int sum=0;
		 while(num>0) {
			 int lastdigit=num%10;
			 sum=sum+lastdigit;
			 num=num/10;
			 
		 }
		 System.out.println(sum);
		

	}

}
