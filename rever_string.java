/*
 Write a Java program to reverse a string. 
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
 */
package W3.Exercise.com;
import java.util.Scanner;
public class rever_string {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Enter the any string :");
String str=scn.nextLine();
	int l=str.length();
	String rev="";
	for(int i=l-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);	
		
	}//end of the main method
}//end of the class
