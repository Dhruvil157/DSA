import java.util.*;
public class JosephusProblem {

	public static int survival(int n, int k)
	{
		if(n==1)
		{
			return 0;
		}
		return (survival(n-1,k)+k)%n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println(survival(sc.nextInt(),sc1.nextInt()));
	}

}
