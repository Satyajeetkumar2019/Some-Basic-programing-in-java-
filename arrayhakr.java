package W3.Exercise.com;
import java.util.Scanner;
public class arrayhakr {

   public static void main(String[] args) {
	   Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();

if(num%2==0) {
	if(num==2&num==4) {
	System.out.println(" Not Weird");
	}
	else if(num==6&num==8&num==10&num==12&num==14&num==16&num==18&num==20) {
		System.out.println(" weird");
	}
	else if(num>20){
		
		System.out.println("Not Weird");
	}
}
else
	//System.out.println(" ");
System.out.println("Weird");
	
   } //end of the main mthod
}//end of the class
