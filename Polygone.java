/*
 *  Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Polygone {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the side  and length of the polygone : ");
		double side=scn.nextDouble();
		double length=scn.nextDouble();
		//Area of polygone =((1/2*side*length)*6);
		double area=((0.5*side*length)*6);
		System.out.println(area);
		//System.out.println((0.5*side*length)*6);

	}//end of the main method 

}//end of the class
