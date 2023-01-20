
public class WindowSlidingGivenSunWithoutK {

	public static boolean sum(int[] arr,int givensum)
	{
		int sum=arr[0];
		int i=0;
		int j=0;
		
		for(i=1;i<=arr.length;i++)
		{
			while(sum>givensum && j<i-1)
			{
				sum-=arr[j];
				j++;
				
			}
			if(sum==givensum)
			{
				return true;
			}
			if(i<arr.length)
			{
				sum+=arr[i];
			}
		}
		/* if the loop ends at i<n:
		while(sum>givensum && j<i-1)
		{
			sum-=arr[j];
			j++;
		}
		*/
		return (sum==givensum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,4,20,3,10,5};
		System.out.println(sum(a,3));
	}

}
