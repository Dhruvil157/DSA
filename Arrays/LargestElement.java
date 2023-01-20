import java.util.*;
public class LargestElement {
	
	public static int largest(int[] arr,int n)
	{
		int temp=arr[0];
		int i;
		int index=0;
		for(i=1;i<n;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
				index=i;
			}
			else
			{
				continue;
			}
			
		}
		return index;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		int[] ar = new int[a];
		for(int i=0;i<a;i++)
		{
			Scanner sc2 = new Scanner(System.in);
			ar[i]=sc2.nextInt();
		}
		System.out.println(largest(ar,a));
	}
}
