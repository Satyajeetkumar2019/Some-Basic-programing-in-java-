/*
  Write a Java program to convert a hexadecimal to a binary number. Go to the editor
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Hexa_Binery {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the hexa number : ");
		String hexa=scn.nextLine();
		//convert hexa to decimal
		int decimal= Integer.parseInt(hexa,16);
		//convert decimal to binery
		String binery=Integer.toBinaryString(decimal);
		System.out.println(binery);
	}//end of the class
}//end of the class
