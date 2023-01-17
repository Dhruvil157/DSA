import java.util.*;

class Counting
{
	int table[] = new int[256];
	public void initialize()
	{
		table[0]=0;
		for(int i=0;i<256;i++)
		{
			table[i]=(i&1)+table[i/2];
		}
	}
	public int count(int n)
	{
		//int count=0;
		
		/*while(n>0)
		{
			//Time complexity: thetha(total bits in n)
			
			//if(n%2!=0)
			{
				count++;
			}
			n=n/2;
			
			//if((n&1)==1)
			{
				count++;
			}
			
			count= count+(n&1);
			n=n>>1;
				//Brian Kerningam's Algorithm
			n= n&(n-1);
			count++;
		}*/
		
		//return count;
		//Lookup table method- time complexity: theta(1)
		
		int res = table[n & 0xff];
		n=n>>8;
		res = res+table[n & 0xff];
		n=n>>8;
		res = res+table[n & 0xff];
		n=n>>8;
		res = res+table[n & 0xff];
		
		return res;
		
		/*
		return table[n & 0xff] + 
		        table[(n >> 8) & 0xff] + 
		        table[(n >> 16) & 0xff] + 
		        table[n >> 24]; 
		        */
	}
}
public class CountingBits {
	
	public static void main(String args[])
	{
		int a;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		Counting c1=new Counting();
		c1.initialize();
		System.out.println(c1.count(a));
	}
}
