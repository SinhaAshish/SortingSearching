package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 System.out.println(" Enter the number ");
		 int num = in.nextInt();
		 int c=0;
		 for( int i=0;i<num; i++)
		 {
			 System.out.println(Fibo(c));
			 c++;
		 }
	}
	
	public static int  Fibo(int num)
	{
		if( num ==0)
			return 0;
		else if( num ==1)
			return 1;
		else
		return Fibo(num-1)+Fibo(num-2);
		
	}

}
