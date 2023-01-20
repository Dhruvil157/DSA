
public class MinConsecutiveFlips {

	public static void flips(int[] arr)
	{
		/*
		int count=0,temp=0;
		if(arr[0]==1)
		{
			temp=1;
		}
		else
		{
			count=1;
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				if(arr[i]==0)
				{
					count++;
				}
				else
				{
					temp++;
				}
			}
		}
		if(count<temp)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
				{
					System.out.print(i+" ");
				}
			}
		}
		if(count>temp)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
				{
					System.out.print(i+" ");
				}
			}
		}
		*/
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				if(arr[i]!=arr[0])
				{
					System.out.print("from "+i+" to ");
				}
				else
				{
					System.out.println((i-1));
				}
			}
		}
		if(arr[arr.length-1]!=arr[0])
		{
			System.out.println((arr.length-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,0,0,0,1,1,1,0,0,1,0,0};
		flips(a);
	}

}
