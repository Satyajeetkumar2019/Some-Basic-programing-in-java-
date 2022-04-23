/*
  Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Comperision {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER the two number :");
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		if(num1 !=num2) {
			System.out.println(num1+"!="+num2);
			}
		if(num1<=num2) {
			
			System.out.println(num1+"<="+num2);
		}
		if(num1<num2) {
			System.out.println(num1+"<"+num2);
		}
		//if else
		//else
		
	}//end of the main method
}//end of the class
