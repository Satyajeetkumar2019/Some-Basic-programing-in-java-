/*
 *  Write a Java program to convert a string to an integer in Java. Go to the editor
Sample Output:

Input a number(string): 25                                             
The integer value is: 25
 */
package W3.Exercise.com;
import java.util.*;
public class Str_Int {
private static int num;
private static String str;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	System.out.print(" Input a number(string):");
		str=scn.nextLine();
		System.out.println(str);
		num=Integer.parseInt(str);
		System.out.println(" The integer value is:"+num);
		
		
	}//end of the main method

}//end of the class
