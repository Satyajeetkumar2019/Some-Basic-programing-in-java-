/*
 *  Write a Java program to extract the first half of a string of even
 *   length. Go to the editor
Test Data: Python
Sample Output:
Pyt
 */
package W3.Exercise.com;
public class String70 {
	public static void main(String[] args) {
		
		String str="python";
		int n=str.length();
		//System.out.print(n);
		System.out.println(str.substring(0,n/2));
	}

}
