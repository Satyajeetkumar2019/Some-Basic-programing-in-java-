import java.util.Scanner;
class Solution3 { 
private static int n;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	try{
n=scn.nextInt();
}
catch(ArithmeticException e){
e.printStackTeace();
}
if(n%2==0)
if(n>2&&n<6)
System.out.println("Not Weird");
if(n>6&&n<20)
System.out.println(" Weird");
if(n>20&&n<100)
System.out.println("Not Weird");
else 
System.out.println(" Weird");

		//System.out.println("Hello World!");
	}//end of the main methoid 
}//end of the class
