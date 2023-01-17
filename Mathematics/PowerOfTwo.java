import java.util.*;
class PowTwo
{
	public boolean pow(int n)
	{
		/*
		int res=0;
		while(n>0)
		{
			n=(n&(n-1));
			res++;
		}
		if(res==1)
		{
			return true;
		}
		return false;
		*/
		/*
		if(n==0)
		{
			return false;
		}
		return ((n&(n-1))==0);
		*/
		return ((n!=0)&& ((n&(n-1))==0));
	}
}

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		PowTwo p1 = new PowTwo();
		System.out.println(p1.pow(num));
	}

}
