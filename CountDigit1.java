import java.util.Scanner;
import java.lang.Math;
class CountDigit1 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
int sum=0;
int r=0;
System.out.println("Enter the any number :");
int x=scn.nextInt();
while(x!=0){
	r=x%10;
	sum=sum+r;
    x=x/10;


}System.out.println(sum);



		System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
