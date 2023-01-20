
public class MergeFunOfMergeSort {
	
	public static void merger(int[] a,int low, int mid, int high)
	{
		int left[]=new int[mid+1];
		int right[]=new int[high-mid];
		int i=low;
		for(;i<left.length;i++)
		{
			left[i]=a[i];
		}
		int j=mid+1;
		for(;j<=high;j++)
		{
			right[j-mid-1]=a[j];
		}
		i=0;
		j=0;
		int k=0;
		while(i<=mid && j<=high)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			a[k]=left[i];
			k++;
			i++;
		}
		while(j<right.length)
		{
			a[k]=right[j];
			k++;
			j++;
		}
		for(k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,15,20,11,30};
		merger(a,0,2,4);
	}

}
