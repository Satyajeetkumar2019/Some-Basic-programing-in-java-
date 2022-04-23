class Example23{ 
int eid;
String name;
String company;
//override to toString method()
public  String toString(){
return "eid\n"+eid+"name\n"+name+"\ncompany"+company;
}//end of the tostring method
	public static void main(String[] args) {
	Example23 e1=new Example23();
	System.out.println(e1+"no modification code'\n");
	e1.eid=34;
	e1.name="kundan";
	e1.company="naresh it";
	Example23 e2=new Example23();
	System.out.println(e2+"\n modified code");
	
	///System.out.println(e1.eid);
	
	}
	/*int x=10;
	int y=30;
	public static void main(String[] args) {
Example23 e1=new Example23();
Example23 e2=new Example23();
e2.x=50;
e2.y=60;
System.out.println(e1.x+"...."+e1.y);
System.out.println(e2.x+".."+e2.y);
	}//end of the main 
	*/


}//end of the claass
