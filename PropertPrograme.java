/*
 *  Write a Java program to check whether Java is installed on your computer. Go to the editor
Expected Output

Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/                                          
Java Class Path: .

 */
package W3.Exercise.com;

public class PropertPrograme {
	public static void main(String[] args) {
	System.out.println(" Java Version:"+System.getProperty("java.version"));
		System.out.println(" Java Runtime Version:"+System.getProperty("java.runtimeversion"));
		System.out.println(" Java Home:"+System.getProperty("java.vendor "));
		System.out.println(" Java Vendor URL:"
				+ " http:"+System.getProperty(" javaurl.vender."));
		System.out.println(" Java Class"
				+ " Path: . "+System.getProperty("java.class.path"));
		
	}//end of the main method
}//end of the class
