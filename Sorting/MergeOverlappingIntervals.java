import java.util.*;

class Interval implements Comparable<Interval>
{
	int s,e;
	Interval(int s,int e)
	{
		this.s=s;
		this.e=e;
	}
	public int compareTo(Interval a)
	{
		return this.s - a.s;
	}
};
public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval arr[]= {new Interval(2,4),new Interval(1,3),new Interval(6,7),
                new Interval(5,8) };
		int n=arr.length;
		mergeinterval(arr,n);
	}
	public static void mergeinterval(Interval arr[],int n)
	{
		Arrays.sort(arr);
		int res=0;
		for(int i=1;i<n;i++)
		{
			if(arr[res].e>=arr[i].s)
			{
				arr[res].s=Math.min(arr[res].s, arr[i].s);
				arr[res].e=Math.max(arr[res].e, arr[i].e);
			}
			else
			{
				res++;
				arr[res]=arr[i];
			}
		}
		 for (int i = 0; i <= res; i++)  
	            System.out.print(  "[" + arr[i].s + ", " + arr[i].e + "] ");  
	}

}
