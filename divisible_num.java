/*
 * Write a Java program to print numbers between
 *  1 to 100 which are divisible by 3, 5 and by both. Go to the editor
Sample Output:

Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                       
Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
95,                                                                    
                                                                       
Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,
 */
  package W3.Exercise.com;
  import java.util.Scanner;
public class divisible_num {
static int num1;
static int num2;
static int m;
static int n;
static int k;
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//------------------------------------------------------
		num1=scn.nextInt();
		System.out.println("Divisible  by  :"+num1);
		//num1=scn.nextInt();
		m=1;
		for(int i=1;i<100;i++) {
		if(m%num1==0)
			System.out.print(m+" ,");
		m++;
		}//end of the for loop
		System.out.println();
	//-------------------------------------------------------------------	
		num2=scn.nextInt();
		System.out.println("Divisible by :"+num2);
		//num2=scn.nextInt();
		n=1;
		for(int i=1;i<100;i++) {
			if(n%num2==0)
				System.out.print(n+" ,");
			n++;
			}//end of the for loop
	//-----------------------------------------------------------
		System.out.println();
		System.out.println("Divisible by Both : "+num1+"&"+num2);
		k=1;
		for(int i=1;i<100;i++) {
			if(k%num1==0&&k%num2==0)
				System.out.print(k+" ,");
			k++;
			}//end of the for loop
		
		
		
		
	}//end of the main method
}//end of the class
