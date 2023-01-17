import java.util.*;

class Fac
{
	public int fact(int m)
	{
		int fact1=1;
		while(m>0)
		{
			fact1 = fact1 * m;
			m--;
		}
		return fact1;
	}
}
public class FactorialIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int x;
		x= sc.nextInt();
		
		Fac f1 = new Fac();
		System.out.println(f1.fact(x));
	}

}
