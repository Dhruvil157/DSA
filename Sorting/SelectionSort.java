
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,5,8,20,2,18};
		/*
		 * Naive Solution
		int temp[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int min=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp[i]=a[min];
			a[min]=Integer.MAX_VALUE;
		}
		*/
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
