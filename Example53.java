class Example53
{
	int x=10;
	int y=20;
	void m1(Example53 e){
	System.out.println(e);
	e=new Example53();
	System.out.println(e);
	
	}//end of the m1 method
	public static void main(String[] args) 
	{

		Example53 e1=new Example53();
		Example53 e2=new Example53();
		System.out.println(e2);
		e1.m1(e2);
		System.out.println(e2);
		System.out.println("Hello World!");
	}//end of the main  
}//end of the class
