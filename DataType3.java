class Sample2
{
void m1(byte b){
System.out.println(" byte method");
}
void m1(int i){ System.out.println("int mthod");}
void m1(short i){ System.out.println("short mthod");}
void m1(long  i){ System.out.println("long  mthod");}
void m1(char i){ System.out.println("char  mthod");}
void m1(float i){ System.out.println("float  mthod");}
void m1(double i){ System.out.println("doble  mthod");}




}//end of the class Sample2
class DataType3 
{
	public static void main(String[] args) 
	{
		Sample2 s=new Sample2();
		s.m1((byte)12);
		s.m1(12L);
		s.m1('a');
		s.m1(12.4);
		s.m1(12.f);
		byte b=12;
		short s2=233;

		boolean b5=true;
		boolean b2=false;
		System.out.println(b5);
		System.out.println(b2);

		//s.m1(b);
		//  s.m1(s2);
	}//end of the main method 
}//end of the lass 
