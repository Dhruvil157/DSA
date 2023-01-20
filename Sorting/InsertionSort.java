
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {20,5,40,60,10,30};
		
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
