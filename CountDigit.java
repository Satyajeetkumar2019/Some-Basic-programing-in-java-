/*
  Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
 */
package W3.Exercise.com;
import java.util.Scanner;
public class CountDigit {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the one number :");
		int num=scn.nextInt();
		int count=0;
	//	int sum=0;
		for(int i=0;i<=num;i++) {
		//	num=num%10;
			count=count+(num%10);
			num=num/10;
		}//end of the for loop
		System.out.println("sum of the digit :"+count);
	}//end iof the main method

}//end of the class
