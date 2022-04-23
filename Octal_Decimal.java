/* Write a Java program to convert a octal number to a decimal number. Go to the editor
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8
 */
package W3.Exercise.com;
import java.util.Scanner;
import java.lang.Math; 
public class Octal_Decimal {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Octal number :");
		long oct=scn.nextInt();
		long decimal=0;
		int i=0;
		while(oct !=0) {
			decimal=(long)(decimal+(oct%10)*Math.pow(8, i++));
			oct=oct/10;
		}//end of the while loop
		System.out.println(decimal);
	}//end of the main method
}//end of the class
