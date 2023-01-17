import java.util.*;

public class PowerSet {

	static void method()
	{
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		double a = s.length();
		double count=Math.pow(2,a);
		
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<a;j++)
			{
				if((i & (1<<j))!=0)
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method();
		
	}

}
