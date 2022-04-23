import java.util.Scanner;
import java.lang.Math;
class Sqrt {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the coffecent of  a,b,c");
	a=scn.nextInt();
	b=scn.nextInt();
	c=scn.nextInt();
	int D=b*b-4*a*c;
	double x,y;
	if(D<0){
		System.out.println("not find root here ");
	}
	if(D==0){
		x=(-b)/(2*a);
	
	System.out.println("both root are same here :"+x);
	}
	if(D>0){
	x=(-b+Math.sqrt(D))/(2.0*a);
	y=(-b-Math.sqrt(D))/(2.0*a);
	
	System.out.println("both root are diffrent :"+x+" and "+y);
	}




		//System.out.println("Hello World!");
	}//end of the  main method 
}//end of the class
