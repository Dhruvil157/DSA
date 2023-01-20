import java.util.*;
public class LeadersInAnArray {

	public static void leaders(int[] arr)
	{
		/*
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=arr[i])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.println(arr[i]);
			}
		}*/
		//time Comp: thetha(n), space Comp: Thetha(n)
		ArrayList<Integer> al = new ArrayList<>();
		int curr_lead = arr[arr.length-1];
		al.add(curr_lead);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>curr_lead)
			{
				curr_lead=arr[i];
				al.add(curr_lead);
			}
		}
		
		Collections.reverse(al);
		System.out.println(al);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {7,10,10,4,6,5,2};
		leaders(a);
 	}

}
