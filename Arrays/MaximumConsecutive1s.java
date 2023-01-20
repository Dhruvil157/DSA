
public class MaximumConsecutive1s {

	public static int count(int[] arr)
	{
		int count=0;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count=0;
				
			}
			else
			{
				count++;
				temp=Math.max(temp, count);
				
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,0,1,1,1,1,0,1,1,1};
		System.out.println(count(a));
	}

}
