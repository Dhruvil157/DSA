
public class AllocateMinimumNoOfPages {

	public static int pages(int[] arr,int n,int k)
	{
		/*
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int pages=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
		}
		return pages;
		*/
		/*
		if(k>n)
		{
			return -1;
		}
		if(k==1)
		{
			return sum(arr,0,n-1);
		}
		if(n==1)
		{
			return arr[0];
		}
		int res=Integer.MAX_VALUE;
		for(int i=k-1;i<n;i++)
		{
			res=Math.min(res,Math.max(pages(arr,i,k-1), sum(arr,i,n-1)));
		}
		
		return res;*/
		int low=arr[0];
		int high=arr[0];
		for(int i=1;i<n;i++)
		{
			if(low<arr[i])
			{
				low=arr[i];
			}
			high+=arr[i];
		}
		int res=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(allow(arr,mid,k))
			{
				high=mid-1;
				res=mid;
			}
			else
			{
				low=mid+1;
			}
		}
		return res;
	}
	public static boolean allow(int[] arr,int bound,int k)
	{
		int allowstud=1;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(sum+arr[i]>bound)
			{
				sum=arr[i];
				allowstud++;
			}
			else
			{
				sum+=arr[i];
			}
		}
		if(allowstud>k)
		{
			return false;
		}
		return true;
	}
	public static int sum(int[] arr,int b, int e)
	{
		int sum=0;
		for(int i=b;i<=e;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,10,30};
		System.out.println(pages(a,a.length,4));
	}

}
