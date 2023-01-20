import java.util.*;
public class Operations_Arrays {

	public static int search(List<Integer> arr, int a,int s)
	{
		for(int j=0;j<a;j++)
		{
			if(arr.get(j)==s)
			{
				return j;
			}
		}
		return -1;
	}
	
	public static void insert(int arr[], int n, int x, int cap, int pos)
	{
		
		if(n == cap)
		{
			System.out.println(n);
    		return ;
		}
    	int index = pos - 1;
		for(int i=n-1;i>index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=x;
		for(int j=0;j<cap;j++)
		{
		System.out.println(arr[j]);
		}
	}
	public static void deletion(int[] arr,int n, int x)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				break;
			}
		}
		if(i==n)
		{
			System.out.println("Error");
			return;
		}
		for(int j=i;j<n-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[n-1]=0;
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}
	public static void main(String args[])
	{
		/*
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			a.add(sc1.nextInt());
		}
		System.out.println("Enter thr element to be searched");
		Scanner sc2 = new Scanner(System.in);
		System.out.println(search(a,n,sc2.nextInt()));
		*/
		/*
		 int arr[] = new int[5], cap = 5, n = 3;

	       arr[0] = 5; arr[1] = 10; arr[2] = 20;
	       int x = 7, pos = 2;
		insert(arr,n,x,cap,pos);
		*/
		
		int ar[] = {1,2,3,4,5};
		deletion(ar,5,2);
	}
}
