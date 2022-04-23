/* Write a Java program to convert a binary number to a Octal number. Go to the editor
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 
 */
/**
 * @author satyajeet kumar
 *
 */
package W3.Exercise.com;
import java.util.Scanner;
class Bibery_Octal {
	public static void main(String [] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the binery number :");
		int binery=scn.nextInt();
		int remender,j=1;
		int decimal=0;
		//convert binery to decimal
		while(binery !=0) {
			remender=binery%10;
			decimal=decimal+remender*j;
			j=j*2;
			binery=binery/10;
		}//end of the while loop
		//-------------------------------------------------
		//convert the decimal number to octal number 
		int [] oct=new int[1000];
		int k=0;
		while(decimal !=0) {
			oct[k]=decimal%8;
			decimal=decimal/8;
		}//end of the while loop
	//--------------------------------------------------
		//print the value of octal number 
		 int m=0;
		 for(m=k-1;m>=0;m--) {
		 System.out.println(oct[m]+" \n");
		 }//for loop end 
		 
		
		
	}//end of the main method
}//end of the class