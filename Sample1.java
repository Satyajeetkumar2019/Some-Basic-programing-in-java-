class Sample1{ 

	public static void main(String[] args) {
	
		System.out.println("start main ");
//System.out.println("a:"+a);//CE
System.out.println("a:"+Example68.a);
Example68 s1=null;
System.out.println(s1.b);
Example68 s2=new Example68();
System.out.println(s2.b);
Example68.m1();
//System.out.println(Example68.x);//CE
System.out.println("HELLO");
//System.out.println(s1.x);//RE
System.out.println(s2.x);
System.out.println(s2.y);
s2.m2();




	}//end of the main method
}//end of the class
