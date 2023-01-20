import java.util.*;
public class IntersectionOfTwoSortedArrays {

	public static void intersection(int[] a,int[] b,ArrayList<Integer> c)
	{
		/*
		for(int i=0;i<a.length;i++)
		{
			if(i>0 && a[i]==a[i-1])
			{
				continue;
			}
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])//&&(!c.contains(a[i]))
				{
					System.out.println(a[i]);
					break;
					//c.add(a[i]);
				}
			}
		}
		//System.out.println(c);
		*/
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(i>0 && a[i]==a[i-1])
			{
				i++;
				continue;
			}
			if(a[i]<b[j])
			{
				i++;
			}
			else if(a[i]>b[j])
			{
				j++;
			}
			else
			{
				//c.add(a[i]);
				
				System.out.println(a[i]);
				
				i++;j++;
			}
		}
		//System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,10,10,10,15,15,20};
		int b[]= {5,10,10,15,30};
		ArrayList<Integer> al=new ArrayList<>();
		intersection(b,a,al);
		
	}

}
