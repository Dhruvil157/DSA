
public class ReverseArray {

	public static void reverse(int[] arr)
	{
		int i=0;
		int temp=0;
		int n=arr.length-1;
		while(i<n)
		{
			temp=arr[i];
			arr[i]=arr[n];
			arr[n]=temp;
			i++;
			n--;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {30,7,10,7,10};
		reverse(a);
	}

}
