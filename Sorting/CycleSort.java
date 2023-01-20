
public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		int a[]= {1,8,3,9,10,10,2,4};
		System.out.println(CycleDistinct(a,a.length));
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	public static int CycleDistinct(int arr[],int n)
	{
		int count=0;
		
		for(int i=0;i<n-1;i++)
		{
			int item=arr[i];
			int pos=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<item)
				{
					pos++;
				}
			}
			if(pos==i)
			{
				continue;
			}
			while(item==arr[pos] && pos<arr.length)
			{
				pos++;
			}
			if(item!=arr[pos])
			{
			int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            count++;
            for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			}
			while(pos!=i)
			{
				pos=i;
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]<item)
					{
						pos++;
					}
				}
				if(pos==i)
				{
					int temp=item;
		            item=arr[pos];
		            arr[pos]=temp;
		            count++;
		            for(int k=0;k<arr.length;k++)
					{
						System.out.print(arr[k]+" ");
					}
		            System.out.println();
					break;
				}
				while(item==arr[pos] && pos<arr.length)
				{
					pos++;
				}
				if(item!=arr[pos])
				{
					
				int temp=item;
	            item=arr[pos];
	            arr[pos]=temp;
	            count++;
	            for(int k=0;k<arr.length;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
				}
			}
		}
		return count;
	}

}
