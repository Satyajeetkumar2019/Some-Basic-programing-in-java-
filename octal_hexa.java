/* Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
 * 
 */
package W3.Exercise.com;
import java.util.Scanner;
public class octal_hexa {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the octal number :");
		String octal=scn.nextLine();
		//convert octal to decimal
		 int decimal=0;
		 decimal=Integer.parseInt(octal,8);
      //convert decimal to hexadecimal
		String hexa=(Integer.toHexString(decimal));
		System.out.println(hexa);
	}//end of the main method
}//end of the class
