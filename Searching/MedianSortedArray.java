import java.util.Arrays;

public class MedianSortedArray {

	public static double median(int[] arr1,int[] arr2)
	{
		/*
		int[] arr= new int[arr1.length+arr2.length];
		int i=0;
		for(;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		for(;i<arr.length;i++)
		{
			arr[i]=arr2[i-arr1.length];
		}
		Arrays.sort(arr);
		
		double mean=0;
		if(arr.length%2!=0)
		{
			mean=arr[arr.length/2];
		}
		else
		{
			mean=(double)(arr[(arr.length/2)-1]+(double)arr[arr.length/2])/2;
		}
		return mean;
		*/
		int n1=arr1.length,n2=arr2.length;
		int begin1=0,end1=n1;
		while(begin1<=end1)
		{
			int i1=(begin1+end1)/2;
			int i2=(n1+n2+1)/2 - i1;
			int min1=(i1==n1)?Integer.MAX_VALUE:arr1[i1];
			int max1=(i1==0)?Integer.MIN_VALUE:arr1[i1-1];
			int min2=(i2==n2)?Integer.MAX_VALUE:arr2[i2];
			int max2=(i2==0)?Integer.MIN_VALUE:arr2[i2-1];
			
			if(max1<=min2 && max2<=min1)
			{
				if((n1+n2)%2==0)
				{
					return ((double)(Math.max(max1,max2)+Math.min(min1, min2))/2);
				}
				else
				{
					return (double)Math.max(max1,max2);
				}
			}
			else if(max1>max2)
			{
				end1=i1-1;
			}
			else
			{
				begin1=i1+1;
			}
		}
		return 0.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a2[]= {5,15,25,35,45,55,65,75,85};
		int a1[]= {1,2,3,4,5};
		System.out.println(median(a1,a2));
	}

}
