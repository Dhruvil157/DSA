
public class QuicksortLomutoPartition {

	
	public static int part(int[] arr,int l, int h)
	{
		int i=l-1;
		int pivot=arr[h];
		for(int j=l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
			}
		}
		int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
		return (i+1);
	}
	
	public static void qsort(int[] arr, int l, int h)
	{
		if(l<h)
		{
			int p=part(arr,l,h);
			qsort(arr,l,p-1);
			qsort(arr,p+1,h);
		}
		
		
	}
	public static void main(String[] args)
	{
		int a[]= {8,4,7,9,3,10,5};
		qsort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
