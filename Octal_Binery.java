/*. Write a Java program to convert a octal number to a binary number. Go to the editor
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111 
 */
package W3.Exercise.com;
import java.lang.Math;
import java.util.Scanner;
public class Octal_Binery {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the octal number :");
		//input the keybord run time value
		String octal_number=scn.nextLine();
		
		//convert octal to decimal
int decimal=Integer.parseInt(octal_number,8);
//convert decimal to binery

System.out.println(Integer.toBinaryString(decimal));
	
			}//end of the main method
}//end of the class
