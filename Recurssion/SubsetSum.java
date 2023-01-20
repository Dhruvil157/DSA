import java.util.*;
public class SubsetSum {

	static int count=0;
	public static int sum(int n, int sum1, int a[])
	{
		if(n==0)
		{
			return (sum1==0)?1:0;
		}
		return (sum(n-1,sum1,a)+sum(n-1,sum1-a[n-1],a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of array");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			Scanner sc1= new Scanner(System.in);
			arr[i]=sc1.nextInt();
		}
		System.out.println("Enter value of sum");
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		System.out.println(sum(a,b,arr));
	}

}
