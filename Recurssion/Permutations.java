import java.util.*;
public class Permutations {

	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	public static void permutation(String str,int k)
	{
		if (k == (str.length()-1))
		{
			System.out.println(str);
			
		}
		else
		{
			for (int i = k; i < str.length() ; i++)
			{
				str = swap(str,k,i);
				permutation(str, k+1);
				str = swap(str,k,i);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		permutation(s,0);
	}

}
