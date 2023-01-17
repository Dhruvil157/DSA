import java.util.*;
class PrimeNumber extends PrimeNum
{
	public void primenum()
	{
		int n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		/*
		// Naive solution
		//Time complexity: O(Square root(n)*n)
		for(int i=2;i<=n;i++)
		{
			if(prime(i)==true)
			{
				System.out.print(i+" ");
			}
		}
		*/
		
		//Sieve of Eratothenes
		if(n<=1)
		{
			return;
		}
		
		else {
			
		
		boolean arr1[] = new boolean[n+1];
		Arrays.fill(arr1, true);
		/*
		for(int i=2; i*i<=n; i++)
		{
			if(arr1[i]==true)
			{
				for(int j=2*i;j<=n;j=j+i) 
				{
					arr1[j]= false;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(arr1[i]==true)
			{
				System.out.print(i+" ");
			}
		}*/
		
		//Optimised Solution
		int count=0;
		for(int i=2; i*i<=n; i++)
		{
			if(arr1[i]==true)
			{
				//System.out.print(i+" ");
				for(int j=i*i;j<=n;j=j+i) 
				{
					arr1[j]= false;
				}
			}
		}
		for(int k=2;k<n;k++)
		{
			if(arr1[k]==true)
			{
				count++;
				System.out.println(k);
			}
		}
		//System.out.println(count);
	}
	
}
}
public class SieveOfEratothenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber p1 = new PrimeNumber();
		p1.primenum();
	}

}
