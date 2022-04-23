class Example25
{
	static int id;
	
	public static void main(String[] args) 
	{


//execessing static member 4 waya 
//1)it name direactly
//2)class neme
//3)null refereance veriable
//4)object refreance veriable
Example25 e1=new Example25();
		System.out.println(id);
		System.out.println(Example25.id);
		System.out.println(new Example25());
		Example25 e2=null;
		System.out.println(e2 .id);
	}
}
