
public class MergeSort {

	public static void merger(int[] arr,int l,int m, int r)
	{
		int n1=m+1-l;
		int n2=r-m;
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[i+l];
		}
		for(int j=0;j<n2;j++)
		{
			right[j]=arr[m+1+j];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;k++;
			}
			else
			{
				arr[k]=right[j];
				j++;k++;
			}
		}
		while(i<n1)
		{
			arr[k]=left[i];
			i++;k++;
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	public static void mergesort(int[] arr, int l, int r)
	{
		if(r>l)
		{
		int m=l+(r-l)/2;
		mergesort(arr,l,m);
		mergesort(arr,m+1,r);
		merger(arr,l,m,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,5,30,15,7};
		mergesort(a,0,4);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
