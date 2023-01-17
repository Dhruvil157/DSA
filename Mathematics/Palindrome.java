import java.util.*;

class pali
{
	public int pal(int m)
	{
		int rev=0,x=0;
		while(m!=0)
		{
			x=m%10;
			m=m/10;
			rev= rev*10+x;
		}
		return rev;
	}
}
public class Palindrome {
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		pali p1 = new pali();
		if(p1.pal(n) == n)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
