
public class FrequenciesInASortedArray {

	public static void frequency(int[] arr)
	{
		int temp=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==temp)
			{
				count++;
			}
			else
			{
				System.out.print(temp+" ");
				System.out.println(count);
				temp=arr[i];
				count=1;
			}
		}
		System.out.print(temp+" ");
		System.out.print(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {40,50,50,50,10};
		frequency(a);
	}

}
