/*
 * Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
Sample Output:

Input seconds: 86399                                                   
23:59:59
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Second_h {
	//to create class labale veriable
private static long second;
private static long min;
private static long hours;
	public static void main(String[] args) {
		//Scanner class obiect creation
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the time second formate : ");
	//input the second 
		second=scn.nextLong();
		//conversion second to minites 
		long sec=second%60;
		//convert minites to hourse
		hours=second/60;
		min=hours%60;
		System.out.println(hours+" :"+min+" :"+sec);

	}

}
