
public class MaxOccuringElePrefixSum {

	public static int maxEle(int[] L, int[] R, int max)
	{
		int[] a = new int[max];
		
		for(int i=0;i<L.length;i++)
		{
			a[L[i]]+=1;
			a[R[i]+1]-=1;
		}
		int maxe=a[0];
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			a[i]=a[i]+a[i-1];
			if(a[i]>maxe)
			{
				maxe=a[i];
				index=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] L1= {1,4,3,1};
		int[] R1= {15,8,5,4};
		System.out.println(maxEle(L1,R1,20));
		
	}

}
