import java.util.Scanner;
class PrimeNumber12 {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the any number :");
	int x=scn.nextInt();
	int m=x;
	int i=0;
	for(i=2;i<x-1;i++){
	if(x%i==0){
	break;
	}
	}

	if(i==m){
	System.out.println("prime number :"+x);
	}
else
	{
	System.out.println("not prime number :"+x);
}




		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
