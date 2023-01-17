import java.util.*;

class Gcd1
{
	public int hcf(int a, int b)
	{
		// Naive solution
		/*int temp = Math.min(a,b);
		while(temp>=2)
		{
			if(a%temp==0 && b%temp==0)
			{
				return temp;
			}
			else
			{
				temp--;
			}
		}
		return 1;*/
		
		// Euclidean Algorithm
		/*
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		return a;
		*/
		
		// Optimised version of Euclidean Algorithm
		
		if(b==0)
		{
			return a;
		}
		else
		{
			return hcf(b, a%b);
		}
	}
}

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number a");
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		
		System.out.println("Enter number b");
		Scanner sc1 = new Scanner(System.in);
		int y;
		y = sc1.nextInt();
		
		Gcd1 g1 = new Gcd1();
		System.out.println(g1.hcf(x, y));
	}

}
