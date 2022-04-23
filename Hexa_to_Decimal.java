/* Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
 * 
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Hexa_to_Decimal {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enthr the heha number");
	//intilize the value 
	String hexa=scn.nextLine();
	//convert the hexa to decimal
	System.out.println(Integer.parseInt(hexa,16));
	
	
	}//end of the main method 
}//end  of the class
