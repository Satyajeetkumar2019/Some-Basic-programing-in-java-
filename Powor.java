import java.util.Scanner;
import java.lang.Math;
class Powor {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int x,y;
	int p=1;
	System.out.println("enter the x and y values :");
	x=scn.nextInt();
	System.out.println();
	y=scn.nextInt();
	for(int i=1;i<=y;i++){
	
	p=p*x;
	
	}
	System.out.println("powor of x is here "+p);




		//System.out.println("Hello World!");
	}
}
