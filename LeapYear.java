import java.util.Scanner;

class LeapYear {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int y;
	y=scn.nextInt();
	if(y%4!=0){
	
	System.out.println("not leap year:");
	}
	else if(y%100!=0){
	System.out.println("leap year :");
	}
	else if(y%400!=0){
	System.out.println("not  leap year");
	}
	else 
		System.out.println("leap year :");


		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
