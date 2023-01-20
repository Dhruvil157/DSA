
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1[]= {"ab","abc"};
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1[i].length();j++)
			{
				for(int k=1;k<s1[i].length();k++)
				{
					if(s1[i].charAt(j)==s1[(i+k)%k].charAt((j+k)%k))
					{
						break;
					}
					else
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
