
public class LeftRotateBy1 {
	public static void rotateOne(int[] arr,int d)
	{
		
		int flag=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=flag;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
	public static void main(String[] args)
	{
		int[] ar= {1,2,3,4,5};
		rotateOne(ar,4);
	}
}
