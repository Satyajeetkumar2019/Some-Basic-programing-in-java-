/*
 *  Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number. Go to the editor
For example x = 5, y=20 and p =3, find the number of integers within the range
 x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:

5
 */
package W3.Exercise.com;
import java.util.Scanner;
public class divisible_con {
static int num1;
static int num2;
static int num3;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	num1=scn.nextInt();
	num2=scn.nextInt();
	num3=scn.nextInt();
	int count=0;	
	for(int i=num1;i<=num2;i++) {
		
		if(i%num3==0 ||i%num3==0)
		count++;
	}	
		
		System.out.println(count);
	}//end of the main method 

}//end of the class
