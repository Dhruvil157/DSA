import java.util.Arrays;

public class MergeTwoSortedArrays {
	
	public static void merge(int[] a,int[] b)
	{
		int arr[]=new int[a.length+b.length];
		/*
		 * int i=0;
		 
		for(;i<b.length;i++)
		{
			arr[i]=b[i];
		}
		for(int j=0;j<a.length;j++)
		{
			arr[j+i]=a[j];
		}
		
		for(int k=1;k<arr.length;k++)
		{
			int key=arr[k];
			int m=k-1;
			while(m>=0 && arr[m]>key)
			{
				arr[m+1]=arr[m];
				m--;
			}
			arr[m+1]=key;
		}*/
		//Arrays.sort(arr);
		int i=0,j=0;
		for(int k=0;k<arr.length;k++)
		{
			if(i>=a.length)
			{
				arr[k]=b[j];
				j++;
			}
			else if(j>=b.length)
			{
				arr[k]=a[i];
				i++;
			}
			else if(a[i]<=b[j])
			{
				arr[k]=a[i];
				i++;
			}
			else
			{
				arr[k]=b[j];
				j++;
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,15,20};
		int b[]= {5,6,6,15};
		
		merge(a,b);
	}

}
