import java.util.Scanner;
class LCM { 

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the any two number :");
	int a=scn.nextInt();
	int b=scn.nextInt();
	int l=0;
	for(l=1;l<a*b;l++){
	if(l%a==0&&l%b==0)
	break;
	
	}
System.out.println("LCM of Given number is here :"+l);


		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
