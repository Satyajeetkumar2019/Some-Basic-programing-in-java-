class Sample4 
{
	static {
	
	System.out.println("SB Sample loaded");
	}
	public static void main(String[] args) throws ClassNotFoundException{
	
		System.out.println("main class loaded Sample");
		//EXA s1=new EXA();
		Class.forName("EXA");
		EXA s1=new EXA();
	}
}
