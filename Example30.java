class Example30 {
static Example30 e1=new Example30();
static int a =m1();
int x=m2();
static  int m1(){
System.out.println("SV ");
return 20;
}

int m2(){
System.out.println("NSB");
return 20;
}
static{
System.out.println("SB start");
new Example30();
System.out.println("SB end");
}//end of the static block
	{
	System.out.println("NSB");
	}//end of the non static block
	Example30(){
	System.out.println("NPC");
	
	}//END of constructor
	public static void main(String[] args) {
	
System.out.println("main start");
new Example30();
System.out.println("main end ");


		//System.out.println("Hello World!");
	}//end of  the main method
}//end of the class
