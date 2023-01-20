
public class StockBuyAndSell2 {

	public static int stock(int[] arr,int start, int end)
	{
		
		int sum=0;
		if(start>=end)
		{
			return 0;
		}
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(arr[j]>arr[i])
				{
					int curr_sum=arr[j]-arr[i]+stock(arr,start,i-1)+stock(arr,j+1,end);
					sum=Math.max(sum, curr_sum);
				}
			}
		}
		/*for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				sum=sum+arr[i]-arr[i-1];
			}
		}*/
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,3,5,8};
		System.out.println(stock(a,0,a.length-1));
	}

}
