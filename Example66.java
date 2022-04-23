class Example66{ 
int x=m1();
int m1(){

System.out.println("start NSV");
return 20;
}//end of the m1 method
	{
	System.out.println("NSB1");
	Example66 s=new Example66();
	System.out.println("End of the NSB");
	}//End of the nsb 
	Example66(){
	System.out.println("start constructor");
	System.out.println("End of  constructor");
	
	}//end of the constructor
	public static void main(String[] args) {
	
		System.out.println("Start main");
		Example66 s=new Example66();
		System.out.println("End of the main ");
	
	}//end of the main method
}//end of the class
