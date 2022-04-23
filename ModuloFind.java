/*
  Write a Java program to calculate the modules of two numbers without
   using any inbuilt modulus operator. Go to the editor
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5   
*/
package W3.Exercise.com;
import java.util.Scanner;
public class ModuloFind {
	//to create the variable 
   static 	int divisor;
	static int dividend;
	static int quotient;
	static int remender;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the dividend : ");
	dividend=scn.nextInt();
	System.out.println("enter the divisor :");
	divisor=scn.nextInt();
	//rule  of divison 
	//dividend=divisor*quotient+remender;
	//remender=dividend-(quotient*divisor);
	quotient=dividend/divisor;
	System.out.println((remender=dividend-(quotient*divisor)));
	
	}//end of the main method 

}//end of the class
