/* Programmer: Julius
 * Date: 09/27/18
 */


import java.io.*;
import javax.swing.JOptionPane;

public class SampleInput1{
	public static void main (String[] args) throws IOException
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your name: ");
			String name = input.readLine();
			System.out.print("Enter your age: ");
			int age = Integer.parseInt(input.readLine());
			System.out.println("Hi " + name + ", you are " + age + " years old.");

		}
}