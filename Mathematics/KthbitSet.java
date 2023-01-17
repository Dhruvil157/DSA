import java.util.*;
class Kthbit
{
	public boolean setbit(int n, int k)
	{
		/*Using left shift operator
		if((n & (1<<(k-1)))!=0)
		{
			return true;
		}
		return false;
		*/
		
		//Using Right Shift Operator
		if(((n>>(k-1)) & 1)==1)
		{
			return true;
		}
		return false;
	}
}
public class KthbitSet {

	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		b=sc1.nextInt();
		Kthbit k1 = new Kthbit();
		System.out.println("ANS "+k1.setbit(a,b));
	}
}
