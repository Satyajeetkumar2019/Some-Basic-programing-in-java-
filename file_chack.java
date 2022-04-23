package W3.Exercise.com;
import java.io.File;
public class file_chack {
	public static void main(String[] args) {
		  File f=new File("abc.txt");  
		System.out.println("/Home /student/abc.txt : \t "+f.length()+" \tbytes");
		System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
		//  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
		
	}//end of the main method
}//end of the class
