import java.util.*;
public class GenerateSubstring {

	public static void substring(String str,String curr,int i)
	{
		if(i==str.length())
		{
			System.out.println(curr);
			return;
		}

		substring(str,curr,i+1);
		substring(str,curr+str.charAt(i),i+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String c=" ";
		int index=0;
		substring(s,c,index);
	}

}
