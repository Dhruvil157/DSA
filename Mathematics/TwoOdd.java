import java.util.*;
class TwoOddOccuring
{
	public int todd(int[] num)
	{
		/*
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
				System.out.println(temp);
			}
		}
		return 0;
		*/
		
		int res1=0,res2=0;
		int xor=0;
		for(int i=0;i<num.length;i++)
		{
			xor=xor^num[i];
		}
		int sn = xor & ~(xor-1);
		
		for(int j=0;j<num.length;j++)
		{
			if((num[j]&sn)!=0)
			{
				res1=res1^num[j];
			}
			else
			{
				res2=res2^num[j];
			}
		}
		System.out.println(res1);
		return res2;
	}
}
public class TwoOdd {

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
		
		TwoOddOccuring o1 = new TwoOddOccuring();
		System.out.println(o1.todd(arr));
	}

}
