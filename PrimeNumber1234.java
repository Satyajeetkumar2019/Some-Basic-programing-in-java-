import java.util.Scanner;
class PrimeNumber1234 { 

	public static void main(String[] args) {

Scanner scn=new Scanner(System.in);
System.out.println("Enter the any number:");
int n=scn.nextInt();
int count=0;
for(int i=1;i<=n;i++){

if(n%i==0){
	count++;
}
}
if(count==2)
System.out.println("yes given number is prime number :"+n);
else 
	System.out.println("not a prime number :");
		//System.out.println("Hello World!");
	}//end of the main method
}//end of class
