/*
 *  Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
Sample Output:

Sum of the first 100 prime numbers: 24133 
 */
package W3.Exercise.com;
//import java.util.Scanner;
public class prime_sum {
	public static void main(String[] args) {
		//Scanner scn= new Scanner(System.in);
		
		/*
		int count =0;
		//System.out.println("Enter the any number :");
		//int n=scn.nextInt();
		int n=2;
		int k=100;
		int count_number=0;
		int s=0;
		//int d;
		for(int p=2;p<k;p++) {
			
		//0 and 1 are not prime number 
		if(n==0||n==1)
			s++;
			//System.out.println();
	//	System.out.println(" not prime number ");
		//-----------------------------------------------------
		else {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			s++;
				//System.out.println();
				//System.out.println(" not prime number :");
			count=1;
			break;
			}//end of the if condation
		}//end of the for loop
				if(count==0) {
				//count_number++;
					System.out.println(n);
					//System.out.println(n+ "\t prime number :");
				}
		}//end of the else block
		
		n++;
	}//end of the our for loop
	//----------------------------------------
		System.out.println(s);
		System.out.println(count_number);
		*/
		
		int n=0;
		int ctr=0;
		int sum=1;
		while(ctr<100) {
			if(n%2!=0) {
			if(prime(n)) {
			sum=sum+n;
			}
			}
			n++;
			ctr++;
		}
		
		
		System.out.println(n);
		
		
	}//end of the main method
	
	public static boolean prime(int n) {
		for(int i=3;i*i<=n;i+=2) 
			if(n%i==0)
		return false;
		
		return true;
	}//end of the method
	
	
	
	
}//end of the classs
