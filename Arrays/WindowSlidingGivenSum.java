
public class WindowSlidingGivenSum {

		public static boolean sum(int[] arr,int k, int gsum)
		{
			int sum=0;
			for(int i=0;i<k;i++)
			{
				sum=sum+arr[i];
			}
			for(int i=k;i<arr.length;i++)
			{
				if(sum==gsum)
				{
					return true;
				}
				sum=sum+arr[i]-arr[i-k];
			}
			if(sum==gsum)
			{
				return true;
			}
			return false;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] arr= {1,8,30,-5,20,7};
			System.out.println(sum(arr,3,44));
		}

	}
