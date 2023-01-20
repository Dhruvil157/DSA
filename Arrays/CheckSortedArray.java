
public class CheckSortedArray {
	public static boolean sortedCheck(int[] arr)
	{
		int n = arr.length;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {8,8,10,6};
		System.out.println(sortedCheck(ar));
	}

}
