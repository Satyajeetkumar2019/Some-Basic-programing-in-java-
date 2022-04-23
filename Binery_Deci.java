/*Write a Java program to convert a binary number to decimal number. Go to the editor
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4 
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Binery_Deci {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the binery number :");
		long B=scn.nextLong();
		long D=0,R;
		int j=1;
		
		while(B !=0) {
				R=B%10;
				D=D+R*j;
				j=j*2;
				B=B/10;
		}//end of the while loop
		System.out.println("Decimal number is here = "+D);
			}//end of th main mtho
}//end of the class
