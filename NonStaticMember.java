class NonStaticMember {
	int a=m1();
	int m1(){
		System.out.println("non static veriable :");
	return 10;
	}
	int b=m2();
	int m2(){
	System.out.println(" non static veriable  :");;
	return 20;
	}

	
	{
		int b=20;
	System.out.println("non static block ");
	}
	NonStaticMember (){
	int x=90;
	System.out.println("non param constructor :");
	}

	public static void main(String[] args) {
	
		System.out.println("main start ");

NonStaticMember  e1=new NonStaticMember ();
System.out.println("main end ");
	}//end of the main method
	{
	System.out.println("non static block 2");
	
	}
}//end of the class
