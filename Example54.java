class Example54 { 
int x=10;
int y=20;
void m1(int p){
System.out.println("before modifacation "+p);
p=50;
System.out.println("aftermodification "+p);
}//end of thr m1 method
void m2(Example54 e){
System.out.println("before modification "+e.x+"....."+e.y);
e.x=40;
e.y=50;
System.out.println("before modification "+e.x+"......"+e.y);
}//end of the m2 method 
	public static void main(String[] args) {
		Example54 e1=new Example54();
System.out.println("befor "+e1.x+"....."+e1.y);
int p=90;
e1.m1(p);
System.out.println("after "+e1.x+"....."+e1.y);
System.out.println("-----------------------------------------------");

Example54 e2=new Example54();
System.out.println("befor "+e2.x+"....."+e2.y);
e1.m2(e2);
System.out.println("after "+e2.x+"....."+e2.y);
System.out.println("-----------------------------------------------");

		//System.out.println("Hello World!");
	}//end of the main method 
}//end of the class
