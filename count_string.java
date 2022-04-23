/*
 *  Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
 */
package W3.Exercise.com;
import java.util.Scanner;
public class count_string {
	private static String str;
	private static int latter;
	private static int digit;
	private static int space;
	private static int other;
	private static int upper;
	private static int lower;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string : ");
		 str=scn.nextLine();
		char[] chr=str.toCharArray();
		 for(int i=0;i<str.length();i++) {
			 if(Character.isLetter(chr[i])) {
				 latter++;
			 }
			 else if(Character.isDigit(chr[i])) {
				 digit++;
				 
			 }
			 else if(Character.isWhitespace(chr[i])) {
				 space++;
				 
			 }
			 else if(Character.isLowerCase(chr[i])) {
				 lower++;
				 
			 }
			 else if(Character.isUpperCase(chr[i])) {
				 
				 upper++;
			 }
			 
			 else {
				 other++;
			 }
		 }//end of the for loop
			 System.out.println("digit of the given string :"+digit);
			 System.out.println("latter of the given string :"+latter); 
			 System.out.println("space of the given string :"+space);
			 System.out.println("upper case of the given string :"+upper);
			 System.out.println("lower of the given string :"+lower); 
			 System.out.println("other of the given string :"+other);
			 
			 
		 //end of the for loop
	}//end of the main method 
}//end of the class
