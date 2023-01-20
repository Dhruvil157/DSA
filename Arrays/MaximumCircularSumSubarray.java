
public class MaximumCircularSumSubarray {

	public static int sum(int[] arr)
	{
		/*
		int sum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			int curr_sum=arr[i];
			int curr_max=arr[i];
			for(int j=1;j<arr.length;j++)
			{
				int index=(i+j)%arr.length;
				curr_sum=curr_sum+arr[index];
				curr_max=Math.max(curr_max, curr_sum);
			}
			sum=Math.max(sum, curr_max);
		}
		*/
		
		return Integer.max(kadane(arr), reverseKadane(arr));
	}
	public static int kadane(int a[])
    {
        int maxend=a[0];
        int res=a[0];
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            maxend=Math.max(maxend+a[i],a[i]);
            res=Math.max(res,maxend);
        }
        return res;
    }
    public static int reverseKadane(int a[])
    {
        int minend=a[0];
        int minsum=a[0];
        int temp=0;

        int n=a.length;
        for(int i=0;i<a.length;i++)
        {
            temp=temp+a[i];
        }
        
        for(int i=1;i<a.length;i++)
        {
            minend=Math.min(minend+a[i],a[i]);
            minsum=Math.min(minend,minsum);
        }
        if(temp==minsum) 
        {
            return temp;
        }
        return (temp-minsum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,-3,-4,7,6,5,-4,-1};
		System.out.println(sum(a));
	}

}
