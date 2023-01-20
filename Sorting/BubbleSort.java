
public class BubbleSort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int arr[]= {11,9,10,8,7};
		boolean swapped=false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				swapped=false;
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
			}
			if(swapped==false)
			{
				break;
			}
		}
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		
	}

}
