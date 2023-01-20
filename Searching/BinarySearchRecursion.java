
public class BinarySearchRecursion {

	public static int bsearch(int[] arr,int low, int high,int temp)
	{
		int mid=(low+high)/2;
		if(low>high)
		{
			return -1;
		}
		else if(arr[mid]==temp)
		{
			return mid;
		}
		else if(arr[mid]>temp)
		{
			return bsearch(arr,low,mid-1,temp);
		}
		return bsearch(arr,mid+1,high,temp);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,30,40,50,60,70};
		System.out.println(bsearch(a,0,a.length-1,35));
	}

}
