import java.util.Scanner;
class Arrays {
static private int n;
	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){

arr[i]=scn.nextInt();

}
for(int i=arr.length-1;i>=0;i--){

System.out.print(" "+arr[i]);

}


//		System.out.println("Hello World!");
	}//end of the main 
}//end of the class
