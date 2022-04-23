class ABC 
{
static {
System.out.println("SB");
ABC S=new ABC();
}
ABC(){

System.out.println("constructor");
}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ABC s2=new ABC();
	}
}
