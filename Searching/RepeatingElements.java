
public class RepeatingElements {
	public static int element(int[] arr)
	{
		/*boolean visit[]= new boolean[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			if(visit[arr[i]]==true)
			{
				return arr[i];
			}
			visit[arr[i]]=true;
		}
		return 0;
		*/
		int slow=arr[0]+1,fast=arr[0]+1;
		
		do {
			slow=arr[slow]+1;
			fast=arr[arr[fast]+1]+1;
		}while(slow!=fast);
		
		slow=arr[0]+1;
		while(slow!=fast)
		{
			slow=arr[slow]+1;
			fast=arr[fast]+1;
		}
		
		return slow-1;
	}
	public static void main(String ars[])
	{
		int a[]= {0,2,4,3,2,2};
		System.out.println(element(a));
	}
}
