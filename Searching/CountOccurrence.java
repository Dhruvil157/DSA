
public class CountOccurrence {

	public static int count(int[] arr,int x)
	{
		int i=firstocc(arr,0,arr.length-1,x);
		int j=lastocc(arr,0,arr.length-1,x);
		if(i==-1 && j==-1)
		{
			return 0;
		}
		return (j-i+1);
	}
	public static int firstocc(int[] arr, int low,int high,int x)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]>x)
			{
				high=mid-1;
			}
			else if(arr[mid]<x)
			{
				low=mid+1;
			}
			else if(arr[mid]==x)
			{
				if(mid==0 || arr[mid]!=arr[mid-1])
				{
					return mid;
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return -1;
	}
	public static int lastocc(int[] arr,int low,int high,int x)
	{

		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]>x)
			{
				high=mid-1;
			}
			else if(arr[mid]<x)
			{
				low=mid+1;
			}
			else if(arr[mid]==x)
			{
				if((mid==arr.length-1) || (arr[mid]!=arr[mid+1]))
				{
					return mid;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,20,20,30,30,30};
		System.out.println(count(a,20));
	}

}
