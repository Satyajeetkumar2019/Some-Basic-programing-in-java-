class Example52 
{
	int x=10;
	int y=20;
	void m1(Example52 e){
	System.out.println(e);
	e=new Example52();
	System.out.println(e);
	
	}//end of the m1 method
	public static void main(String[] args) 
	{

		Example51 e1=new Example52();
		Example52 e2=new Example52();
		System.out.println(e2);
		e1.m1(e2);
		System.out.println(e2);
		System.out.println("Hello World!");
	}
}
