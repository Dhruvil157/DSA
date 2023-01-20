
public class CountInversionsInArray {

	public static int merge(int[] a,int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int count=0;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=a[i+l];
		}
		for(int j=0;j<n2;j++)
		{
			right[j]=a[m+j+1];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				k++;
				i++;
			}
			else 
			{
				a[k]=right[j];
				k++;
				count+=(n1-i);
				j++;
			}
			
		}
		while(i<n1)
		{
			a[k]=left[i];
			i++;k++;
		}
		while(j<n2)
		{
			a[k]=right[j];
			j++;k++;
		}
		return count;
	}
	public static int mergesort(int[] a,int l,int r)
	{
		int count=0;
		if(l<r)
		{
			int m=l+(r-l)/2;
			count+=mergesort(a,l,m);
			count+=mergesort(a,m+1,r);
			count+=merge(a,l,m,r);
		}
		return count;
	}
	public static int inversions(int[] a)
	{
		/*
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					count++;
				}
			}
		}
		return count;
		*/
		return mergesort(a,0,a.length-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,5,4};
		System.out.println(mergesort(a,0,4));
	}

}
