import java.util.*;

class Trail
{
	public int countzero(int m)
	{
		int temp=0;
		
		for (int i=5;i<=m;i=i*5)
		{
			temp = temp + m/i;
		}
		return temp;
		
	}
}
public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		Trail t1 = new Trail();
		System.out.println(t1.countzero(a));
	}

}
