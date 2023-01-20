
public class IndexOfFirstOccurrence {

	public static int search(int[] arr,int low, int high, int x)
	{
			
			
			if(low>high)
			{
				return -1;
			}
			int mid=(low+high)/2;
			if(arr[mid]>x)
			{
				return search(arr,low,mid-1,x);
			}
			else if(arr[mid]<x)
			{
				return search(arr,mid+1,high,x);
			}
			else if(arr[mid]==x)
			{
				if(mid==0 || (arr[mid]!=arr[mid-1]))
				{
					return mid;
				}
				else
				{
					return search(arr,low,mid-1,x);
				}
			}
			return 0;
	}
	public static int bsearch(int[] arr,int low,int high,int x)
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {5,10,10,15,20,20,20};
		System.out.println(bsearch(a,0,a.length-1,20));
	}

}
