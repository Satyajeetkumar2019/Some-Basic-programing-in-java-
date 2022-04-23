
class Example56{ 
int x=10;
int y=20;
void m1(){
System.out.println(this.x);
System.out.println(this.y);
int x=30;
System.out.println(this.x);
System.out.println(this.y);
}//end of the m1 mevothod
	public static void main(String[] args) {
	
	Example56 s1=new Example56();
s1.m1();
//System.out.println(Example55.x);
//System.out.println(y);


		System.out.println("Hello World!");
	}//end of the main method
}//end of the class
