
public class TrappinRainWater {

	public static int trap(int[] arr)
	{
		int sum=0;
		int[] left= new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			left[j]=Math.max(left[j-1],arr[j]);
		}
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1],arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+Math.min(left[i],right[i])-arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {6,6,2,3,4,4,4,1,3};
		System.out.println(trap(a));
	}

}
