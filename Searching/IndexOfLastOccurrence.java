
public class IndexOfLastOccurrence {

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

		int a[]= {1,10,10,10,20,20,40};
		System.out.println(lastocc(a,0,a.length-1,10));
	}

}
