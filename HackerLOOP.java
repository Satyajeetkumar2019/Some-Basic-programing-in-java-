import java.util.Scanner;
class Solution { 

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	if(n%2!=0){
	System.out.println("Weird");
	}

	else{
	if(n>2&&n<6){
System.out.println(" Not Weird");
	if(n>6&&n<20)
System.out.println("Weird");
	if(n>20)
		System.out.println("Not Weird");
	}//end else bl
	}//end of the else 

	}//end method
}//end class
