import java.util.*;

class Count
{
	public int countnum(int m)
	{
		int count=0;
		while(m!=0)
		{
			m=m/10;
			count++;
		}
		return count;
	}
}
public class CountDigit {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid number for count");
		int n = sc.nextInt();
		Count c1 = new Count();
		System.out.println(c1.countnum(n));
	}
}
