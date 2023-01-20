import java.util.*;

/*
 // Java program to demonstrate 
// working of Collections.sort() 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// A user-defined Point class implementing 
// Comparable interface
class Point implements Comparable<Point>
{
    int x, y;
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
        return this.x - P.x;
    }
}

class Example2 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of Integers 
        List<Point> list = new ArrayList<Point>(); 
        list.add(new Point(5, 10)); 
        list.add(new Point(2, 20));  
        list.add(new Point(10, 30)); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the points
        for (Point p: list)
            System.out.println(p.x + " " + p.y);
    } 
} 
*/

//using comparator interface
class Point implements Comparable<Point>
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
        return this.x - P.x;
    }
}
class mycompar implements Comparator<Point>
{
	public int compare(Point p1,Point p2)
	{
		return p1.x-p2.x;
	}
}
class Example2
{
	public static void main(String args[])
	{
		/*List<Point> li=new ArrayList<>();
		li.add(new Point(5,10));
		li.add(new Point(2,20));
		li.add(new Point(10,30));
		//System.out.println(li);
		Collections.sort(li,new mycompar());
		//System.out.println(li);
		 *
		 */
		Point arr[]= {new Point(10,20),new Point(3,12),new Point(5,7)};
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++)
            System.out.println(arr[i].x+" "+arr[i].y);
	}
}