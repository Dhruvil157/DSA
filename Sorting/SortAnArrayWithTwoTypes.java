
public class SortAnArrayWithTwoTypes {

	public static void sortposneg(int[] arr)
	{
		/*
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				swap(arr,i,res);
				res++;
			}
		}
		*/
		/*
		int i=-1;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<0)
			{
				i++;
				swap(arr,i,j);
			}
		}
		*/
		int i=-1,j=arr.length;
		
		while(true)
		{
			do {i++;}
			while(arr[i]<0);
			do {j--;}
			while(arr[j]>=0);
			
			if(i>=j)
			{
				return;
			}
			swap(arr,i,j);
		}
	}
	public static void sortevenodd(int[] arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				swap(arr,i,res);
				res++;
			}
		}
	}
	public static void sortbinary(int[] arr)
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				swap(arr,i,res);
				res++;
			}
		}
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr [a]= arr[b];
		arr[b]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {15,-3,-2,12};
		sortposneg(a);
		//sortevenodd(a);
		//sortbinary(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
