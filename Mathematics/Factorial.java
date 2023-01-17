import java.util.*;

class Fact
{
	
	public int facto(int m)
	{
		
		if(m==0)
		{
			return 1;
		}
		else
		{ 
		return (m * facto(m-1));
		}
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Fact f1 = new Fact();
		System.out.println(f1.facto(n));
	}

}
