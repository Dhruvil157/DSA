import java.util.*;
public class TwoSum {
	static void method()
	{
		int target;
		System.out.println("Enter a target value ");
        Scanner sc1 = new Scanner(System.in);
        target=sc1.nextInt();
        int nums[] = {2,7,11,15};
        
        for(int j=0;j<3;j++)
        {
            for(int k=1;k<=3;k++)
            {
                if(nums[j]+nums[k]==target)
                {
                    
                    System.out.println(j+" "+k);
                }
            }
        }
	}
public static void main(String args[])
{
	method();
}
}
