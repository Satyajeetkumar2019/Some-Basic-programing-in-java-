/*
  Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km 
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Find_distance_two_point {
	private static double x1;
	private static double x2;
	private static double y1;
   private  static double y2;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the codinate of first point :");
	     x1=scn.nextDouble();
		 y1=scn.nextDouble();
		System.out.println("Enter the codinate of second  point :");
		 x2=scn.nextDouble();
		 y2=scn.nextDouble();
		double d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println(d);
	
		System.out.println(Math.sqrt(625));
		
		
	}//end of the main method
}//end of the class
