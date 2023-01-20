import java.util.Arrays;

public class MajorityElements {

	public static int majority(int[] arr)
	{
		/*
		int temp=0;
		int count=1;
		int[] ar= new int[arr.length];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=arr[i];
		}
		Arrays.sort(arr);
		int flag=0;
		int cap=arr.length/2;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				flag=Math.max(flag, count);
				count=1;
			}
			flag=Math.max(flag, count);
			if(flag>cap)
			{
				temp=arr[i];
			}
			
		}
		if(flag<=cap)
		{
			temp=-1;
			System.out.println(temp);
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==temp)
			{
				System.out.println(i);
			}
		}
		*/
		
		int n=arr.length;
		/*
		for(int i = 0; i < n; i++)
    	{
    		int count = 1;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] == arr[j])
    				count++;
    		}

    		if(count > n / 2)
    			return i;
    	}

    	return -1;
    	*/
		// Boyer-Moore majority vote algorithm
		int res=0;
		int count=1;
		
		for(int i=1;i<n;i++)
		{
			if(arr[res]==arr[i])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count==0)
			{
				res=i;
				count=1;
			}
		}
		
		count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==arr[res])
			{
				count++;
			}
			if(count>n/2)
			{
				return res;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {8,8,6,6,6,6};
		System.out.println(majority(a));
	}

}
