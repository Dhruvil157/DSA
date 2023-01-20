
public class MoveZero {

	public static void movezero(int[] arr)
	{
		//Naive Solution
		/*
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}*/
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {8,0,0,10,0,20};
		movezero(ar);
	}

}
