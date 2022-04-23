/*
 *  Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
 */
package W3.Exercise.com;
import java.util.Scanner;
public class HexaGonalArea {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the side of hexa gonal :");	
	double side=scn.nextDouble();
	double area=((3*1.732051*side*side)/2);
	
		System.out.println("Area of hexa gonal is  =   "+area);
	}

}
