class Typeconversion {
	public static void main(String[] args) {
	//primitive typecovrsion 
	// there are java two  type onversion support 
	//1)implicet type conversion //autotype conversion //widening 
	//2)Explicit type conversion //cast// narrowing 
	//Rule of type conversion 
	/*---------------------------------------------------------------
	//byte->short ->int -> long ->float ->double
                     char |
					 <-------Auto onvrsion------------
					 ----------Cast--------------------------->
	----------------------------------------------------------------
	
		char ch='8';
		int in=ch;
		//System.out.println(in);


		int in1='A';
		//System.out.println(in1);
char ch1='A';
//System.out.println(ch1);
int num='a';
//System.out.println(num);
char ch2=65000;//?
System.out.println(ch2);
char ch3=255;//y
System.out.println(ch3);
char ch4=65535;//?
System.out.println(ch4);
char ch5=66000;//CE 
System.out.println(ch5);


		 int i=260;
	byte b11=(byte)i;
	//System.out.println(b11);
	//byte b1=b;

	short s2=10;
	short s3=s2;
int t=20;
int l2=t;
long q=90l;
long p=q;
double d1=29d;
double d2=d1;
float f1=20f;
float f2=f1;
char cr='s';
char cr1=cr;
String str="sajayu";
String str1=str;

	//short s=90+b;//CE  p l c
	short s=90;
	int i1=19+s;
	//long l=20l;
*/
//refereance datatype conversion 

/*
Object obj=new Object();
Object obj1=new A();
Object obj2=new B();
Object obj3=new C();
Object obj4=new D();
	A a1=new A();
	A a2=new B();
	A a3=new C();
	//A a4=new D();//CE incompetable type conersion
	
	B b1=new B();
	//B b2=new A();
	B b3=new C();//no compile tim error
B b4 =new D();
	//B b2=new A();//incompateble type conversion
	//C c1=new C();
	//C c2=new B();
*/
//java support two type refreanse convrsion conversio 
//1)upcasting 
//A a=new B();
//B b=a1;//CE incompeteble type conversion 
//2)down casting 
A a8 = new B();
//B b6=(A)a
//some rule refreance type conversion 
A a=new B();
System.out.println(a instanceof Object);//true
System.out.println(a instanceof A);//true
System.out.println(a instanceof B);//true
System.out.println(a instanceof C);//false
//System.out.println(a instanceof D);

Object o=new B();
System.out.println(o instanceof A);//true
System.out.println(o instanceof B);//true
System.out.println(o instanceof C);//false
System.out.println(o instanceof  D);//false
// some test case check below program 
Example ex=new Sample();
ex.m1();
//ex.m2();//CE
//to solved this problem to use downcasting 
Sample s=(Sample)ex;
s.m2();

	}//end of the main nethod
}//end of the class
class Example
{
	void m1(){
	System.out.println("m1 mthod");
	}
}//end of the exam class
class Sample extends Example
{
	void m2(){
		System.out.println("m2 mthod");
	
	}
}









class A
{
	
}//end of the class A
class B extends A 
{
	
}//end of the lass B
class C extends B
{
	
}//endd of the class C
class D
{
}
