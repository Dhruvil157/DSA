
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,10,30,5,50,40,2};
		heapsort(a,a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void heapsort(int arr[],int n)
	{
		buildheap(arr,n);
		for(int i=n-1;i>=1;i--)
		{
			swap(arr,i,0);
			heapify(arr,i,0);
		}
	}
	public static void buildheap(int arr[],int n)
	{
		for(int i=(n-2)/2;i>=0;i--)
		{
			heapify(arr,n,i);
		}
	}
	public static void heapify(int arr[],int n,int i)
	{
		int largest=i;
		
		int left=i*2+1,right=i*2+2;
		
		if(left<n && arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<n && arr[right]>arr[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
			swap(arr,largest,i);
			heapify(arr,n,largest);
		}
	}
	public static void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
