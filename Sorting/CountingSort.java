import java.util.*;
public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,-1,8,9,4,1};
		sort(a,10);
		//sortkele(a,5);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void sortkele(int[] arr,int k)
	{
		int min=arr[0],max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			min=Math.min(min,arr[i]);
			max=Math.max(max, arr[i]);
		}
		int count[]=new int[max-min+1];
		for(int i=0;i<max;i++)
		{
			count[i]=0;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-min]++;
		}
		for(int i=1;i<=max;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		int output[] = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=output[i];
		}
	}
	public static void sort(int[] arr,int k)
	{

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
		int count[]=new int[max-min+1];
		for(int i=0;i<k;i++)
		{
			count[i]=0;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]-min]++;
		}
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		int output[] = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=output[i];
		}
	}

}
