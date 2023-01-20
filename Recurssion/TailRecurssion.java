import java.util.*;
public class TailRecurssion {

	
	public static void method(int n,int k)
	{
		/* Non tail recursive solution.
		if(n==0)
		{
			return;
		}
		method(n-1);
		System.out.println(n);
		*/
		// it's tail recursive solution of the previous solution
		// it would take less time than the previous solution
		if(n==0)
		{
			return;
		}
		System.out.println(k);
		method(n-1,k+1);

	}
	//Factorial using tail recurssion
	public static int fact(int n, int k)
	{
		if(n==0 || n==1)
		{
			return k;
		}
		return fact(n-1,k*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		System.out.println(fact(a,b));
	}

}
