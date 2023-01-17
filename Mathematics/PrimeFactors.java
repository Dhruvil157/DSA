import java.util.*;

class PrimeN
{
	public boolean prime(int m)
	{
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
			for(int i=5;i*i<m;i=i+6)
			{
				if((m%i)==0 || (m+2)%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
class PrimeFac extends PrimeN
{
	public void PrimeF()
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		/*
		//Time complexity: O(n^3/2)
		int i=2;
		while(x>1)
		{
			if(prime(i)==true && x%i==0)
			{
				x=x/i;
				System.out.print(i+" ");
			}
			else
			{
				i++;
			}
		}
		*/
		/*
		if(x<=1)
		{
			System.out.println("Error");
		}
		else
		{
			for(int i=2;i*i<=x; i++)
			{
				while(x%i==0)
				{
					System.out.print(i+" ");
					x=x/i;
				}
			}
			if(x>1)
			{
				System.out.print(x);
			}
		}
		*/
		if(x<=1)
		{
			System.out.println("Error");
		}
		else
		{
			while(x%2==0)
			{
				System.out.print("2"+" ");
				x=x/2;
			}
			while(x%3==0)
			{
				System.out.print("3"+" ");
				x=x/3;
			}
			for(int i=5;i*i<=x;i=i+6)
			{
				while(x%i==0)
				{
					System.out.print(i+" ");
					x=x/i;
				}
				while(x%(i+2)==0)
				{
					System.out.print(i+2+" ");
					x=x/(i+2);
				}
			}
			if(x>3)
			{
				System.out.print(x);
			}
		}
	}
}
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PrimeFac p1 = new PrimeFac();
		p1.PrimeF();
	}

}
