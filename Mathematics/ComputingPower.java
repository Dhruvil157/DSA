import java.util.*;

class Comp
{
	public int compow(int m, int n)
	{
		/*int a=1;
		for(int i=1;i<=n;i++)
		{
			a=m*a;
		}
		return a;
		*/
		/*
		//Time complexity: thetha (log n), auxilary space: thetha(log n)
		int temp=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			temp = compow(m, n/2);
			temp = temp*temp;
			if(n%2==0)
			{
				return temp;
			}
			else
			{
				return temp*m;
			}
		}*/
		
		// Time complexity:O(log n), auxilary space:O(1)
		int res=1;
		while(n>0)
		{
			if(n%2!=0)
			{
				res=res*m;
			}
			m=m*m;
			n=n/2;
			
		}return res;
	}
}
public class ComputingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter values of m and n");
		int x,y;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		y=sc1.nextInt();
		Comp c1 = new Comp();
		System.out.println(c1.compow(x, y));
	}

}
