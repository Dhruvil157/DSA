import java.util.*;

class Lcm1
{
	public int lcm(int a, int b)
	{
		/* Naive solution
		for(int i=Math.max(a, b); i<=a*b; i++)
		{
			if(i%a==0 && i%b==0)
			{
				return i;
			}
			else
			{
				continue;
			}
		}
		return 1;
		*/
		
		// Using Euclidean Algorithm - Effective Solution
		
		return ((a*b)/gcd(a,b));
	}
	public int gcd(int m,int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return gcd(n, m%n);
		}
	}
}


public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.println("Enter b number");
		Scanner sc1 = new Scanner(System.in);
		int y;
		y = sc1.nextInt();
		
		Lcm1 l1 = new Lcm1();
		System.out.println(l1.lcm(x, y));
	}

}
