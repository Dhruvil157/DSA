
public class RemoveDuplicates {

	public static int duplicates(int[] arr)
	{
		//int[] temp = new int[arr.length];
		//temp[0]=arr[0];
		int res=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		
		for(int j=0;j<res;j++)
		{
			System.out.println(arr[j]);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,20,30,30,30,30};
		System.out.println(duplicates(a));
	}

}
