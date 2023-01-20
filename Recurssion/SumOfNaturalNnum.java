import java.util.*;
public class SumOfNaturalNnum {

	public static int sum(int n,int k)
	{
		if(n==0)
		{
			return k;
		}
		return sum(n-1,k+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(sum(a,0));
	}

}
