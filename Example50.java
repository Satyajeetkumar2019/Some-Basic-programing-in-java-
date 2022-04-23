class Example50{ 
int x;
int y;
void m1(Example50 e1){
x=x+1;
y=y+2;
e1.x=e1.x+3;
e1.y=e1.y+4;

}//end of the m1 method
	public static void main(String[] args) {
	
	Example50  e2=new Example50();
    Example50  e3=new Example50();
	e2.m1(e3);
	System.out.println(e2.x+"..."+e2.y);
	System.out.println(e3.x+"..."+e3.y);
e3.m1(e2);
	System.out.println(e2.x+"..."+e2.y);
	System.out.println(e3.x+"..."+e3.y);
	e2.m1(e2);
	System.out.println(e2.x+"..."+e2.y);
	System.out.println(e3.x+"..."+e3.y);
	e3.m1(e3);
	System.out.println(e2.x+"..."+e2.y);
	System.out.println(e3.x+"..."+e3.y);




		System.out.println("Hello World!");
	}//end of the main method
}//end of the class
