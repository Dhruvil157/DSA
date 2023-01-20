import java.util.Arrays;

public class MeetingTheMaximumGuests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {800,700,600,500};
		int dep[]= {840,820,830,530};
		System.out.println((maxcount(arr,dep,arr.length)));
	}
	public static int maxcount(int arr[],int dep[],int n)
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1,j=0,res=1,curr=1;
		while(i<n && j<n)
		{
			if(arr[i]<=dep[j])
			{
				curr++;
				i++;
			}
			else
			{
				curr--;
				j++;
			}
			res=Math.max(res, curr);
		}
		return res;
	}

}
