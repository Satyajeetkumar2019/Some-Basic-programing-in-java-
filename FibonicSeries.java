import java.util.Scanner;
class FibonicSeries {
static int c;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the any  number :");
int a=-1;
int b=1;
int n=scn.nextInt();
for(int i=1;i<n;i++){
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}





	}//end of the main method 
}//end of the class
