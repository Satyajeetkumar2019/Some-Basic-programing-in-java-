import java.util.Scanner;
class Co_Prime {
static private int a;
static private int b;
static private int i;
static int main;
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
System.out.println("Enter the any two number :");
a=scn.nextInt();
b=scn.nextInt();
main=a<b?a:b;
for(i=2;i<=main;i++){
if(a%i==0&&b%i==0){
break;
}
}
if(i==main+1){
System.out.println("co-prime number :");

}
else{
System.out.println("no co-prime number :");
}

//}//end of the for loop









		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
