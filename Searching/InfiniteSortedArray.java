
public class InfiniteSortedArray {

	public static int search(int[] arr,int x)
	{
		/*
		int i=0;
		while(true)
		{
			if(arr[i]==x)
			{
				return i;
			}
			if(arr[i]>x)
			{
				return -1;
			}
			i++;
		}
		*/
		int i=0;
		if(x==arr[i])
		{
			return 0;
		}
		i=1;
		while(arr[i]<x)
		{
			i=i*2;
		}
		if(arr[i]==x)
		{
			return i;
		}
		return bsearch(arr,i/2+1,i-1,x);
	}
	public static int bsearch(int[] arr,int low, int high,int x)
	{
		if(low>high)
		{
			return -1;
		}
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]>x)
			{
				return bsearch(arr,low,mid-1,x);
			}
			return bsearch(arr,mid+1,high,x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,10,15,20,40,80,90,100,120,500,600,700,800,900,1000,1100,1200,1300,1400,1500};
		System.out.println(search(a,80));
	}

}
