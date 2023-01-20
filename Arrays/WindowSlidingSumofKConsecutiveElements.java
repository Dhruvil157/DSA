
public class WindowSlidingSumofKConsecutiveElements {

	public static int sum(int[] arr,int k)
	{
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+arr[i];
		}
		int maxsum=sum;
		for(int i=k;i<arr.length;i++)
		{
			sum=sum+arr[i]-arr[i-k];
			maxsum=Math.max(maxsum, sum);
		}
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,8,30,-5,20,7};
		System.out.println(sum(arr,3));
	}

}
