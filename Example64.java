class Example64{ 
void m1(){
System.out.println("start of m1() method");
m1();
System.out.println("End  of m1() method");
}
	public static void main(String[] args) {
		System.out.println("Main method start ");
Example64 e1=new Example64();
System.out.println("Object creation ");
//e1.m1();

	}//end of the main method
int x=m2();
int  m2(){
System.out.println("start of m2() method");
return 20;
}//end of the m2 method

Example64(){
System.out.println("star of constructor ");
System.out.println("end of the constuctor");
}//end of the constructor
}//end of the class
