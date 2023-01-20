
public class WindowSlidingNBonacci {

	public static void nbonacci(int n,int m)
	{
		
		int[] a=new int[m+1];
		for(int i=0;i<n-1;i++)
		{
			a[i]=0;
		}
		
		int sum=1;
		int j=0;
		a[n-1]=1;
		for(int i=n;i<m;i++)
		{
			a[i]=sum;
			sum=sum+a[i]-a[j];
			j++;
		}
		/*
		a[n-1]=1;
		a[n]=1;
		for(int i=n+1;i<m;i++)
		{
			a[i]= 2*a[i-1]-a[i-n-1];
		}
		*/
		for(int i=0;i<m;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nbonacci(5,15);
	}

}
