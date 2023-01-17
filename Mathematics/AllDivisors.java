import java.util.*;

class DivNum
{
	public void divisor()
	{
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		/* 
		 * time complexity: O(n), Auxilary space: O(1)
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}*/
		/*
		//Time Complexity: O(Square root(n))
		
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				if(i!=n/i)
				{
					System.out.print(n/i+" ");
				}
			}
		}
		*/
		//Time Complexity: O(Square root(n))
		// prints in sorted order
		int i=1;
		for(;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		for(;i>=1;i--)
		{
			if(n%i==0 && i*i<n)
			{
				System.out.print(n/i+" ");
			}
		}
	}
}
public class AllDivisors {
	
	public static void main(String args[])
	{
		DivNum d1= new DivNum();
		d1.divisor();
	}
}
