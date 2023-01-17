import java.util.*;
class OddOccuring
{
	public int odd(int[] num)
	{
		int temp=0;
		
		//Time Complexity: O(n^2)
		for(int i=0;i<num.length;i++)
		{
			int count=0;
			for(int j=0;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
				}
				else
				{
					continue;
				}
			}
			if(count%2!=0)
			{
				temp=num[i];
			}
		}
		/*
		 for(int i=0;i<num.length;i++)
		 {
		 	temp=temp^i;
		 }
		 */
		 
		return temp;
	}
}
public class OneOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a range of array");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			arr[i]=sc1.nextInt();
		}
		
		OddOccuring o1 = new OddOccuring();
		System.out.println(o1.odd(arr));
	}

}
