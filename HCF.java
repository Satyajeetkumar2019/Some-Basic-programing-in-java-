import java.util.Scanner;
class HCF { 

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the two number ");
	int a=scn.nextInt();
	int b=scn.nextInt();
	int H=0;
	for(H=a<b?a:b;H>1;H--){
		if(a%H==0&&b%H==0)
	break;
	}

		System.out.println("HCF "+H);
	}
}
