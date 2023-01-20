
public class BinarySearchIterative {

	public static int search(int[] arr,int temp)
	{
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(temp==arr[i])
			{
				return i;
			}
		}
		*/
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]>temp)
			{
				high=mid-1;
			}
			if(arr[mid]<temp)
			{
				low=mid+1;
			}
			if(arr[mid]==temp)
			{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
	System.out.println(search(a,20));	
	}

}
