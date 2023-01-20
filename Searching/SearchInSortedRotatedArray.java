
public class SearchInSortedRotatedArray {

	public static int search(int[] arr,int x)
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]>arr[low])
			{
				if(x>=arr[low] && x<arr[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				if(x<=arr[high] && x>arr[mid])
				{
					low=mid+1;
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

		int[] a= {100,200,300,20,30,40,50};
		System.out.println(search(a,25));
	}

}
