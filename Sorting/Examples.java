import java.util.Arrays;
import java.util.Collections;
/*class Point implements Comparable<Point>
{
    int x, y;
    
    // Costructor intialising x & y
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point P)
    {
        // Comparing two objects by
        // Subtracting the passed object 
        // from current object
        return this.y - P.y;
    }
}
*/
public class Examples {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Primitive Data Types: Dual Pivot Quick sort
		int a[]= {5,6,7,2,1,0};
		char b[]= {'D','C','A','b'};
		//Arrays.sort(a);
		Arrays.sort(a,1,4); // sorted subarray of the given array
		Arrays.sort(b);
		//System.out.println(Arrays.toString(a));
			//System.out.println(Arrays.toString(b));
		//sorting of non-primitive datatypes
			/*Point arr[] = {
		            new Point(10, 20), 
		            new Point(3, 12), 
		            new Point(5, 7) };
		            
		        // Sorting the object containing array 
		        Arrays.sort(arr);
		        for(int i = 0; i < arr.length; i++)
		            System.out.println(
		                arr[i].x + " " + arr[i].y);
		                */
		Integer a1[]= {5,20,10,3,12,30};
		//sort in decreasing order using Wrapper class 
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
	}

}
