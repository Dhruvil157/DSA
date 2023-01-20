import java.util.*;
public class TowerOfHanoi {

	public static void TOH(int n,char A, char B, char C)
	{
		if(n==1)
		{
			System.out.println("Move 1 from "+A+" to "+C);
			return;
		}
		TOH(n-1,A,C,B);
		System.out.println("Move "+n+" from "+A+" to "+C);
		TOH(n-1,B,A,C);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		TOH(a,'A','B','C');
	}

}
