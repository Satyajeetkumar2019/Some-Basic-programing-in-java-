import java.util.Scanner;
class PrimeFactor{ 
static int i;
static int x;
static int temp;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the any two number :");
	int n=scn.nextInt();
	int m=scn.nextInt();
	for(x=n+1;x<m;x++){
		for(i=2;i<x;i++){
		if(x%i==0){
		temp=temp+1;
		}//if condation
		}//inner loop 
		if(temp==0){

		System.out.println(x);
		}
		else{
		temp=0;
		}
	}//outer lop
	
	
	}//end of the main method 
}//end of the class
