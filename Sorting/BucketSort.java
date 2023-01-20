import java.util.*;
public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,80,10,85,75,99,18};
		bucket(a,a.length,5);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void bucket(int[] arr,int n,int k)
	{
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			max=Math.max(max,arr[i]);
		}
		max++;
		ArrayList<ArrayList<Integer>> bkt=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<k;i++)
		{
			bkt.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++)
		{
			int bi=(k*arr[i])/max;
			bkt.get(bi).add(arr[i]);
		}
		for(int i=0;i<k;i++)
		{
			Collections.sort(bkt.get(i));
		}
		int index=0;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<bkt.get(i).size();j++)
			{
				arr[index++]=bkt.get(i).get(j);
			}
		}
	}

}
