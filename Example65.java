class Example65 
{
	static{
	System.out.println("start static blocck");
	Example65 s=new Example65();
	System.out.println("end static blocck");
	}//end of the static block
	{
	System.out.println("start non static blocck");
	System.out.println("end non static  blocck");
	}
	Example65(){
	System.out.println("start constructor blocck");
	System.out.println("end  constructor blocck");
	}//ens of the constructor
	public static void main(String[] args) 
	{
		System.out.println("main statr");
		System.out.println("End of the main method");


	}//end of the main method
}//end of the class
