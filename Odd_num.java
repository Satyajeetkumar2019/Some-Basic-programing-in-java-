/*
 * Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
Sample Output:

1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                     
                                                                    
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 
 */

package W3.Exercise.com;
import java.util.Scanner;
public class Odd_num {
	//static int num;
	public static void main(String[] args) {
		/*
		//Scanner scn=new Scanner(System.in);
		//num=scn.nextInt();
		int num=1;
		while(num<100) {
			if(num%2 !=0)
				System.out.println(num);
			num++;
		}
		*/
		
		int num=1;
		for(int i=1;i<100;i++) {
			
			if(num%2!=0) {
			System.out.println(num);
			}//end of the if condation
			num++;
		}//end of the loop
	
		
			}//end of the main method
}//end of the class
