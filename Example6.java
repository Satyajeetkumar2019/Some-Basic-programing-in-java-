class Example6 { 
static class A {
public static void main(String[] args){
System.out.println("inner main ");
}//end inner main
}//end inner class




	public static void main(String[] args) {
	A.main(new String[]{"skaj"});
		System.out.println("outter main !");
	}
}
