import java.util.*;


public class PalindromeStr {
	
	public static boolean palindrom(String str,int start, int end)
	{
		if(start>=end)
		{
			return true;
		}
		
		return ((str.charAt(start)==str.charAt(end)) && palindrom(str,start+1,end-1));
	}
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(palindrom(s,0,s.length()-1));
	}
}
