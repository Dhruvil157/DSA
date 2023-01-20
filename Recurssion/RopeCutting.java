import java.util.*;
public class RopeCutting {

	public static int rope(int n, int a, int b, int c)
	{
		int count=0;
			if(n==0)
			{
				return 0;
			}
			if(n<0)
			{
				return -1;
			}
			int res= Math.max(rope(n-a,a,b,c),Math.max(rope(n-b,a,b,c), rope(n-c,a,b,c)));
			
			if(res==-1)
			{
				return -1;
			}
			return (res+1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value of n");
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter a value of a");
		Scanner sc1 = new Scanner(System.in);
		int a1=sc.nextInt();
		System.out.println("Enter a value of b");
		Scanner sc2 = new Scanner(System.in);
		int b1=sc.nextInt();
		System.out.println("Enter a value of c");
		Scanner sc3 = new Scanner(System.in);
		int c1=sc.nextInt();
		
		System.out.println(rope(n1,a1,b1,c1));
	}

}
