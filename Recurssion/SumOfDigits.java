import java.util.*;
public class SumOfDigits {

	public static int sum(int n,int k)
	{
		if(n==0)
		{
			return k;
		}
		return(sum(n/10,n%10+k));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(sum(a,0));
	}

}
