
public class TwoPointerGivenSumSortedArray {

	public static boolean sum(int[] arr,int x)
	{
		int i=0,j=arr.length-1;
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

		int[] a= {2,5,8,12,30};
		System.out.println(sum(a,18));
	}

}
