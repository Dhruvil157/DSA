
public class SquareRoot {

	public static int sroot(int x)
	{
		int low=1,high=x;
		int ans=-1;
		if(x==0)
		{
			return 0;
		}
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(mid==x/mid)
			{
				return mid;
			}
			else if(mid>x/mid)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sroot(15));
	}

}
