
public class MaximumSumSubArray {

	public static int sum(int[] arr)
	{
		
		/*
		int sum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i;j<arr.length;j++)
			{
				temp=temp+arr[j];
				sum=Math.max(temp,sum);
			}
		}
		*/
		int temp=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			temp=Math.max(temp+arr[i],arr[i]);
			sum=Math.max(sum, temp);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {-5,1,-2,3,-1,2,-2};
	System.out.println(sum(a));	
	}

}
