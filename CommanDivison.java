/*
 *  Write a Java program that accepts two integer values between 25 to 75
 and return true if there is a common digit in both numbers.
  Go to the editor
Sample Output:

Input the first number : 35                                            
Input the second number: 45                                            
Result: true
 */
package W3.Exercise.com;
import java.util.Scanner;
public class CommanDivison {
private static int n1,n2;
	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			
			System.out.print("Enter the first number :");
			n1=scn.nextInt();
			System.out.print("Enter the second number : ");
			n2=scn.nextInt();
		
		
		System.out.println(m2(n1,n2));
			
			
			
	}//end of the main method
	static boolean  m2(int p,int q) {
		if(p<25||q>75)
			return false;
		int x=p%10;
		int y=q%10;
		p=p/10;
		q=q/10;
		return (p==q||p==x||q==y||x==y);
	}//local method 
}//end of the class
