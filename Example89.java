class Example89 
{
static int a=m1();
static int m1(){
System.out.println("Example SM");
return 10;
}
static{
System.out.println("Example SB");

}
static void m2(){

System.out.println(" Example  static m2()");
}

	public static void main(String[] args) 
	{
		System.out.println("Example MM");
	}
}
