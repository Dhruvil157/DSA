
public class KthSmallestElement {

	public static int part(int[] arr,int l,int r)
	{
		int i=l-1;
		int pivot=arr[r];
		for(int j=l;j<=r-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		return (i+1);
	}
	public static void swap(int[] arr, int a,int b)
	{
		int temp=arr[b];
		arr[b]=arr[a];
		arr[a]=temp;
	}
	public static int kthsmallest(int[] arr,int l, int r,int k)
	{
		while(l<=r)
		{
			int p=part(arr,l,r);
			if(p==(k-1))
			{
				return arr[p];
			}
			else if(p>(k-1))
			{
				r=p-1;
			}
			else
			{
				l=p+1;
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,4,5,8,11,6,26};
		
		System.out.println(kthsmallest(a,0,a.length-1,7));
		
	}

}
