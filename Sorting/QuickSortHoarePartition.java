
public class QuickSortHoarePartition {
 
	public static int partition(int[] arr, int l, int h)
	{
		int i=l-1,j=h+1;
		int pivot=arr[l];
		while(true)
		{
			do {
				i++;
			}
			while(arr[i]<pivot);
				
			do{
				j--;
			}
			while(arr[j]>pivot);
			
			if(i>=j)
			{
				return j;
			}
			swap(arr,i,j);
		}
	}
	public static void swap(int[] arr, int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void qsort(int[] arr,int l, int h)
	{
		if(l<h)
		{
			int p=partition(arr,l,h);
			qsort(arr,l,p);
			qsort(arr,p+1,h);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {8,4,7,9,3,10,8,5};
		qsort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
