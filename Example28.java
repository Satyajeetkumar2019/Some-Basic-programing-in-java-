class Example28 
{
	int x;
	int y;
	void m1(Example28  e){
	x=x+1;
	y=y+2;
	e.x=e.x+6;
	e.y=e.y+9;
	}
	public static void main(String[] args) 
	{
		Example28 e1=new Example28();
		Example28 e2=new Example28();
e1.m1(e2);
System.out.println(e1.x+"..."+e1.y);
System.out.println(e2.x+"..."+e2.y);

e2.m1(e1);
System.out.println(e1.x+"..."+e1.y);
System.out.println(e2.x+"..."+e2.y);




       //Example28 e3=new Example28();


		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the classs
