import java.util.*;
public class NTo1 {

	public static void numbers(int n)
	{
		if(n==0)
		{
			return;
		}
		numbers(n-1); //for 1 to N
		System.out.print(n+" ");
		//numbers(n-1);  for N to 1
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		numbers(a);
	}

}
