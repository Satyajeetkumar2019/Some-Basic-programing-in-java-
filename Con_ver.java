/* Write a Java program to calculate the sum of two integers and return 
 * true if the sum is equal to a third integer. Go to the editor
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Con_ver {

	private static int num1;
	private static int num2;
	private static int num3;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
      //input first number 		
		System.out.print("Input the first number : ");
		num1=scn.nextInt();
		System.out.println(num1);
		//input second number 
		System.out.print("Input the second  number : ");
		num2=scn.nextInt();
		System.out.println(num2);
		//input third number 
		System.out.print("Input the third  number :");
		num3=scn.nextInt();
		System.out.println(num3);
System.out.println("Result "+sumoftwo(num1,num2,num3));
	}//end of the main method
	public static boolean  sumoftwo(int x,int y,int z) {
		
		return((x+y)==z||(y+z)==x||(z+x)==y);
		
	}//end of the method 
}//end of the class
