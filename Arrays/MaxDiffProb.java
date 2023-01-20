
public class MaxDiffProb {

	public static void dif(int[] arr)
	{
		/* time comp: thetha(n^2)
		int temp=arr[1]-arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[j]-arr[i])>temp)
				{
					temp=arr[j]-arr[i];
				}
				
			}
		}
		*/
		int temp=arr[1]-arr[0];
		int minv=arr[0];
		
		for(int j=1;j<arr.length;j++)
		{
			temp=Math.max(temp,arr[j]-minv);
			minv=Math.min(minv,arr[j]);
		}
		System.out.println(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {9,4,3,2};
		dif(a);
	}

}
