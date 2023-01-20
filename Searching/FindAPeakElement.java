
public class FindAPeakElement {

	public static int peak(int[] arr)
	{
		/*
		if(arr.length==1)
		{
			return arr[0];
		}
		else if(arr[0]>=arr[1])
		{
			return arr[0];
		}
		else if(arr[arr.length-1]>=arr[arr.length-2])
		{
			return arr[arr.length-1];
		}
		for(int i=1;i<arr.length-2;i++)
		{
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
			{
				return arr[i];
			}
		}
		return 0;
		*/
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==arr.length-1 || arr[mid+1]<=arr[mid]))
			{
				return arr[mid];
			}
			if(mid>0 && arr[mid-1]>=arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {30,15,40,50,30};
		System.out.println(peak(a));
	}

}
