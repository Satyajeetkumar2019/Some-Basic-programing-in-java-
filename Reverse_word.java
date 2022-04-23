/*
 *  Write a Java program to reverse a word. Go to the editor
Sample Output:

Input a word: dsaf
Reverse word: fasd
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Reverse_word {
	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
		System.out.print(" Input string : ");
		String str=scn.nextLine();
		char[] chr=str.toCharArray();
		for(int i=chr.length-1;i>=0;i--)
		System.out.print(chr[i]);
		
	}//end of the main method

}//end of the class
