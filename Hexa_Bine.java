/*
 * Write a Java program to convert a hexadecimal to a octal number. Go to the editor
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100 
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Hexa_Bine {
public static void main(String args[]) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the hexadecimal number :");
	//read the runtime value of keybord
	String hexa=scn.nextLine();
	//convert hexa to decimal
	int decimal= Integer.parseInt(hexa,16);
	//convert the decimal to octal number 
	System.out.println(Integer.toOctalString(decimal));
	
}//end of the main method 
}//end of the class
