import java.util.Scanner;

public class SecondLargest {

	public static int second(int[] arr, int n)
	{
		/*
		int temp=0;;
		int i;
		int flag=-1;
		for(i=0;i<n;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]!= temp)
			{
				if(flag==-1)
				{
					flag=j;
				}
				else if(arr[j]>arr[flag])
				{
					flag=j;
				}
			}
		}
		return flag;
		*/
		
		int res=-1,longest=0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[longest])
			{
				res=longest;
				longest=i;
			}
			else if(arr[i]!=arr[longest])
			{
				if(res==-1 || arr[i]>arr[res])
				{
					res=i;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		int[] ar = new int[a];
		for(int i=0;i<a;i++)
		{
			Scanner sc2 = new Scanner(System.in);
			ar[i]=sc2.nextInt();
		}
		System.out.println(second(ar,a));
	}

}
