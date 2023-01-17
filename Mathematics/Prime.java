import java.util.*;
class PrimeNum
{
	public boolean prime(int m)
	{
		/*
		if(m==0 || m==1)
		{
			return false;
		}
		else if(m==2)
		{
			return true;
		}
		
		else 
		{
			//for(int i=2; i<m; i++) - Naive solution
		for(int i=2; i*i<m; i++) // Effective Solution - pair of composite number is between 2 - square root (n)
		{
			if(m%i==0)
			{
				return false;
			}
		}
		
		}
		return true;
		*/
		
		//More Effective Solution
		if(m==0 || m==1)
		{
			return false;
		}
		else if(m==2 || m==3)
		{
			return true;
		}
		
		else if(m%2==0 || m%3==0)
		{
			return false;
		}
		
		else 
		{
		for(int i=5; i*i<m; i=i+6) 
		{
			if(m%i==0 || (m+2)%i==0)
			{
				return false;
			}
		}
		
		}
		return true;
	}
}
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		PrimeNum p1 = new PrimeNum();
		System.out.println(p1.prime(a));
	}

}
