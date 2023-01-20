
public class Equilibrium {

	public static boolean equilibrium(int[] arr, int[] prefix)
	{
		/*
		if((prefix[prefix.length-1]-prefix[0])==0)
		{
			return true;
		}
		else if(prefix[prefix.length-2]==0)
		{
			return true;
		}
		else
		{
		for(int i=1;i<prefix.length-1;i++)
		{
			if((prefix[prefix.length-1]-prefix[i])==prefix[i-1])
			{
				return true;
			}
		}
		}
		return false;
		*/
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int lsum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(lsum==(sum-arr[i]))
			{
				System.out.println(i);
				return true;
			}
			lsum=lsum+arr[i];
			sum=sum-arr[i];
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,2,2};
		int[] prefix= new int[a.length];
		prefix[0]=a[0];
		for(int i=1;i<prefix.length;i++)
		{
			prefix[i]=prefix[i-1]+a[i];
		}
		System.out.println(equilibrium(a,prefix));
	}

}
