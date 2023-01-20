
public class UnionOfTwoSortedArray {

	public static void union(int a[], int[] b)
	{
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(i>0 && a[i]==a[i-1] )
			{
				i++;
				continue;
			}
			if(j>0 && b[j]==b[j-1])
			{
				j++;
				continue;
			}
			if(a[i]<b[j])
			{
				System.out.println(a[i]);
				i++;
			}
			else if(a[i]>b[j])
			{
				System.out.println(b[j]);
				j++;
			}
			else
			{
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
		while(i<a.length)
		{
			if(i>0 && a[i]!=a[i-1])
			{
				System.out.println(a[i]);
				i++;
			}
			else
			{
				i++;
			}
			
		}
		while(j<b.length)
		{
			if(j>0 && b[j]!=b[j-1])
			{
				System.out.println(b[j]);
				j++;
			}
			else
			{
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,5,8};
		int b[]= {2,8,9,10,15};
		union(a,b);
	}

}
