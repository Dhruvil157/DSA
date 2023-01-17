import java.util.*;

class MisN
{
	public int num(int[] num, int n)
	{
		int temp=0;
		for(int i=0;i<num.length;i++)
		{
			temp=temp^num[i];
		}
		for(int i=1;i<=n;i++)
		{
			temp=temp^i;
		}
		return temp;
	}
}
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number for the range of an array");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			Scanner sc1= new Scanner(System.in);
			arr[i]=sc1.nextInt();
		}
		System.out.println("Enter a range");
		Scanner sc2=new Scanner(System.in);
		int c=sc2.nextInt();
		
		MisN m1= new MisN();
		System.out.println(m1.num(arr, c));
	}

}
