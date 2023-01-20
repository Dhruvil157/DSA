
public class TwoPointerTripletSum {

	public static boolean sum(int[] arr, int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(twosum(arr,i+1,arr.length-1,x-arr[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean twosum(int[] arr, int start, int end, int x)
	{

		int i=start,j=end;
		while(i<j)
		{
			if((arr[i]+arr[j])==x)
			{
				return true;
			}
			else if(arr[i]+arr[j]>x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,3,4,8,9,20,40};
		System.out.println(sum(a,62));
	}

}
