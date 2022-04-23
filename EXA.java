class EXA {
static int a=m1();
static int m1(){
System.out.println("SV exa");
return 10;
}//end of the m1 method
static{

System.out.println("SB loaded");
}


	public static void main(String[] args) {
	
		System.out.println("main EXA");
	}//end of the main method
	static void m2(){
	
	System.out.println("M2() EXA");
	
	}
	EXA(){
	
	System.out.println("constructor loaded");
	}
}//end of the class
