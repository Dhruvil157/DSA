
public class Count1sInSortedArray {

	public static int ones(int[] arr)
	{
		/*
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				break;
			}
		}
		return (arr.length-i);
		*/
		
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==0)
			{
				low=mid+1;
			}
			else
			{
				if(mid==0 || (arr[mid-1]==0))
				{
					return (arr.length-mid);
				}
				else
				{
					high=mid-1;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {0,0,0,0,1,1,1,1,1};
		System.out.println(ones(a));
	}

}
