
public class LeftRotatebyD {
	public static void rotateD(int[] arr,int d)
	{
		/*for(int n=0;n<d;n++)
		{
			
		int flag=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=flag;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		*/
		/*
			int[] temp= new int[d];
			for(int i=0;i<d;i++)
			{
				temp[i]=arr[i];
			}
			for(int i=0;i<arr.length-d;i++)
			{
				arr[i]=arr[i+d];
			}
			int count =0;
			for(int i=arr.length-d;i<arr.length;i++)
			{
				arr[i]=temp[count];
				count++;
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			*/
		
		 // right rotate
		if(d>arr.length)
		{
		d=d%arr.length;
		}
			reverse(arr,0,arr.length-1);
			reverse(arr,d,arr.length-1);
			reverse(arr,0,d-1);
		
		/*
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
		*/
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void reverse(int[] arr, int i, int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args)
	{
		int[] ar= {1,2,3,4,5};
		rotateD(ar,7);
	}
}
