/* Programmer: Julius
 * Date: 09/27/18
 */

import javax.swing.JOptionPane;

public class SampleInput2
{
	public static void main(String[] args)
		{
			String name;
			int age;

			name = JOptionPane.showInputDialog("Enter your name: ","Name");
			age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));

			JOptionPane.showMessageDialog(null,"Hi " + name + ", you are " + age + " years old.");
		}
}