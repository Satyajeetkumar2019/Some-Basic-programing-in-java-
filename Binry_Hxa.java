/* Write a Java program to convert a binary number to hexadecimal number. Go to the editor
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D
 */
package W3.Exercise.com;
import java.util.Scanner;
public class Binry_Hxa {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the binery number :");
	   int  binery=scn.nextInt();
	   int[] hexa=new int[1000];
     	int j=1;
        int remender;
      int decimal=0;
	 while(binery !=0) {
		remender=binery%10;
		decimal=decimal+remender*j;
		j=j*2;
		binery=binery/10;
	}//end of the while loop
	//--------------------------------------------	 
//convert the decimal to hexadecimal number 
	 int i=0;
	 while(decimal !=0) {
		 hexa[i]=decimal%16;
		 decimal=decimal/16;
		 i++;
	 }//end of the while loop
	 //print the value of hexadecimal number 
	 int k;
	 for(k=i-1;k>=0;k--) {
		 if(hexa[k]>9)
	 System.out.println((char)(hexa[k]+55) +" \n");
		 else
	 System.out.println(hexa[k]+" \n");
	 }//for loop end 
	 
	 
	}//end of the main method 
}//end of the class