import java.util.Scanner;
class ARM { 

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the any number :");
	int n=scn.nextInt();
	int x=n;
	int r,a=0;
	while(x!=0){
	r=x%10;
	a=a+r*r*r;
	x=x/10;
	
	
	
	}//end while loop

if(n==a)
	System.out.println("yes");
else
System.out.println("no ");
	//	System.out.println("Hello World!");
	}//end of the main method
}//end of the class
