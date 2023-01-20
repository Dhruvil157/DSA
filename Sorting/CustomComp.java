
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class mycomp implements Comparator<Integer>
{
	public int compare(Integer a, Integer b)
	{
		return a%3-b%3;
	}
}
public class CustomComp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= {5,20,12,3,30};
		//custom sorting using wrapper class
		Arrays.sort(a,new mycomp());
		System.out.println(Arrays.toString(a));
	}

}
