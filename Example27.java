class Example27 
{
	int x=10;
	int y=12;
	/*
	void m1(){
	System.out.println(" mi m1method");
	
	}
	void printXXX(){
	System.out.println(a);
	System.out.println(b);
	m1();
	}
	*/
	public static void main(String[] args) 
	{
		Example27 e1=new Example27();

       Example27 e2=new Example27();

      Example27 e3=e2;
    
		System.out.println(e1.x+".."+e1.y);
		System.out.println(e2.x+".."+e2.y);
		System.out.println(e3.x+".."+e3.y);
		e2.x=90;
		e2.y=80;
		System.out.println(e2.x+".."+e2.y);
		System.out.println(e1.x+".."+e1.y);


		//e2.printXXX(); 
	}//end of xthe  main method
}//end of the classs
