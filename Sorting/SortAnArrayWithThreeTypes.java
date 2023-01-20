
public class SortAnArrayWithThreeTypes {

	public static void sortthree(int[] arr,int a,int b)
	{
		int low=0,mid=0,high=arr.length-1;
		
		while(mid<=high)
		{
			if(arr[mid]<a)
			{
				swap(arr,low,mid);
				low++;mid++;
			}
			else if(arr[mid]>=a && arr[mid]<=b)
			{
				mid++;
			}
			else
			{
				swap(arr,mid,high);
				high--;
			}
		}
	}
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,5,6,3,20,9,40};
		sortthree(a,5,10);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
