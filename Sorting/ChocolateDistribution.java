import java.util.*;
public class ChocolateDistribution {

	public static int distribute(int[] arr,int m)
	{
		Arrays.sort(arr);
		int dif=arr[m-1]-arr[0];
		for(int i=1;i<=arr.length-m;i++)
		{
			dif=Math.min(arr[i+m-1]-arr[i],dif);
		}
		return dif;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,88,89,39,67,71,85,57,18,7,61,50,38,6,60,18,19,46,84,74,59};
		System.out.println(distribute(a,12));
		
	}

}
