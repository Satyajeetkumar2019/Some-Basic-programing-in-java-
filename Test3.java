class Test3{
	public static void main(String[] args) {
	//print method having 9 over loaded mthod 
	//-------------------------------------------------------------------------------------
System.out.print(true);
System.out.print(12);
System.out.print(12.8);
//in case 1
//System.out.print(12,2);//CE
System.out.print(56766);
System.out.print("satya");
System.out.print("ho "+6+7);
//System.out.print(" hi %d"+5);//RE
//System.out.print(" hi "6);//CE
//-------------------------------------------------------------------------
//printli is 10 overloaded method
System.out.println(true);
System.out.println(4);
System.out.println(788.89);
System.out.println(598767);
//in case 1
//System.out.println(12,89);//CE
System.out.println("kuman");
//-------------------------------------------------------------------------------------------------------
//printf() methoed  2 overloaded 
System.out.printf( "satyajeet kumar");
System.out.printf(" hi %d",4);
//System.out.printf(" hi ",9);//NO CE but RE
//System.out.printf("hi %d ");//RE
//in Case 1
System.out.printf("%d  %d",12,2);//NO CE 
// System.out.printf("hi %d %d",12);//RE 
//System.out.printf("hi %d",12,23);//RE!
//Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d

	}//end of the main method
}//end of the class
