class Example26 {
void m1(){
System.out.println(" in m1 method");
}//end of the m1 method
void m2(){
System.out.println("in m2 method :");
}//end of the m2 method

	public static void main(String[] args){ 
		System.out.println("in main method :");
		//Example26.m1();//CE
		Example26 e2= new Example26();
       e2.m1();
//------------------------------------------------------------- 
	   e2.m2();


	}//end of the main method
}//end of the class
