
public class PrefixSum1 {

	
	public static int getsum(int[] arr,int l,int r)
	{
		/*
		// Naive solution with Time: O(n)
		int sum=0;
		for(int i=l;i<=r;i++)
		{
			sum=sum+arr[i];
		}
		
		return sum;
		*/
		
		
		int sum=0;
		if(l!=0)
		{
			sum=arr[r]-arr[l-1];
		}
		else
		{
			sum=arr[r];
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,3,9,6,5,4};
		int[] prefix= new int[a.length];
		prefix[0]=a[0];
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i]=prefix[i-1]+a[i];
		}
		System.out.println(getsum(prefix,1,3));
	}

}
