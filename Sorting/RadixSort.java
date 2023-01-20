
public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {319,212,6,8,100,50};
		radix(a,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void radix(int[] arr,int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			max=Math.max(max, arr[i]);
		}
		
		for(int exp=1;max/exp>0;exp=exp*10)
		{
			countingsort(arr,n,exp);
		}
	}
	public static void countingsort(int[] arr,int n,int exp)
	{
		int count[]=new int[10];
		int output[]=new int[n];
		
		for(int i=0;i<10;i++)
		{
			count[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			count[(arr[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++)
		{
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
	}
}
